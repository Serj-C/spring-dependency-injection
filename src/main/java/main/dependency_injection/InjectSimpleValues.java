package main.dependency_injection;

import com.example.simple_values_injection.spel.InjectSimpleSpel;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimpleValues {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring/app-context-xml.xml");
        ctx.refresh();

        // Simple Values Injection
        /*InjectSimpleValues simpleValues = (InjectSimpleValues) ctx.getBean("injectSimpleValues");
        System.out.println(simpleValues);*/

        // Simple Values Injection using SpEL
        InjectSimpleSpel simpleSpel = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(simpleSpel);

        ctx.close();
    }
}
