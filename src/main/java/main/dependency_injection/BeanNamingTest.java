package main.dependency_injection;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class BeanNamingTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring/bean_naming/app-context-01.xml");
        ctx.refresh();

        Map<String, String> beans = ctx.getBeansOfType(String.class);
        beans.forEach((key, value) -> System.out.println(key));

        ctx.close();
    }
}
