package main.dependency_injection.bean_autowiring;

import com.example.bean_autowiring.Bar;
//import com.example.bean_autowiring.Foo;
import com.example.bean_autowiring.complex.Foo; // Using interface as type
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("gigi")
@Lazy
public class BeanAutowiringAnnotationsDemo {
    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;

    public BeanAutowiringAnnotationsDemo() {
        System.out.println("Target.constructor()");
    }

    public BeanAutowiringAnnotationsDemo(Foo fooOne) {
        System.out.println("Target(Foo) called");
    }

    public BeanAutowiringAnnotationsDemo(Foo fooOne, Bar bar) {
        System.out.println("Target(Foo, Bar) called");
    }

    @Autowired
    @Qualifier("fooImplOne")
    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }

    @Autowired
    @Qualifier("fooImplTwo")
    public void setFooTwo(Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("Property fooTwo set");
    }

    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring/bean_autowiring/app-context-03.xml");
        ctx.refresh();

        BeanAutowiringAnnotationsDemo instance =
                ctx.getBean(BeanAutowiringAnnotationsDemo.class);

        ctx.close();
    }
}
