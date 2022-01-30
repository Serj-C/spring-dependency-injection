package main.dependency_injection;

import com.example.bean_inheritance.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanInheritanceDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring/bean_inheritance/app-context.xml");
        ctx.refresh();

        Singer parent = (Singer) ctx.getBean("parent");
        Singer child = (Singer) ctx.getBean("child");

        System.out.println("Parent:\n" + parent);
        System.out.println("Child:\n" + child);

        ctx.close();
    }
}
