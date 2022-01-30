package main.dependency_injection;

import com.example.bean_autowiring.Bar;
//import com.example.bean_autowiring.Foo; // for class types (exact implementation specified)
import com.example.bean_autowiring.complex.Foo; // using interface as type
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanAutowiringDemo {
    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;

    public BeanAutowiringDemo() {
        System.out.println("Target.constructor()");
    }

    public BeanAutowiringDemo(Foo fooOne) {
        System.out.println("Target(Foo) called");
    }

    public BeanAutowiringDemo(Foo fooOne, Bar bar) {
        System.out.println("Target(Foo, Bar) called");
    }

    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }

    public void setFooTwo(Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("Property fooTwo set");
    }

    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        //ctx.load("classpath:/spring/bean_autowiring/app-context-01.xml");
        ctx.load("classpath:/spring/bean_autowiring/app-context-02.xml");
        ctx.refresh();

        BeanAutowiringDemo instance = null;

        //System.out.println("Using byName:\n");
        //instance = (BeanAutowiringDemo) ctx.getBean("targetByName");

        System.out.println("\nUsing byType:\n");
        instance = (BeanAutowiringDemo) ctx.getBean("targetByType");

        //System.out.println("\nUsing constructor:\n");
        //instance = (BeanAutowiringDemo) ctx.getBean("targetConstructor");

        ctx.close();
    }
}
