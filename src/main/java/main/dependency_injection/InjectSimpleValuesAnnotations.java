package main.dependency_injection;

import com.example.simple_values_injection.spel_annotations.InjectSimpleSpelAnnotations;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimpleValuesAnnotations {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring/app-context-annotation.xml");
        ctx.refresh();

        // Simple Values Injection with annotations
        /*InjectSimpleValuesAnnotations simpleValuesAnnotations =
                (InjectSimpleValuesAnnotations) ctx.getBean("simpleValuesAnnotations");
        System.out.println(simpleValuesAnnotations);*/

        // Simple Values Injection using SpEL with annotations
        InjectSimpleSpelAnnotations simpleSpelAnnotations =
                (InjectSimpleSpelAnnotations) ctx.getBean("simpleValuesSpelAnnotations");
        System.out.println(simpleSpelAnnotations);

        ctx.close();
    }
}
