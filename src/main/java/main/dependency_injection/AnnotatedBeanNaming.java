package main.dependency_injection;

import com.example.bean_naming.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class AnnotatedBeanNaming {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring/bean_naming/app-context-04.xml");
        ctx.refresh();

        Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);
        beans.forEach((key, value) -> System.out.println("id: " + key));

        ctx.close();
    }
}
