package main.dependency_injection;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class BeanAliases {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring/bean_naming/app-context-03.xml");
        ctx.refresh();

        Map<String, String> beans = ctx.getBeansOfType(String.class);
        beans.forEach((key, value) ->
            System.out.println("id: " + key
                    + "\n aliases: " + Arrays.toString(ctx.getAliases(key)) + '\n')
        );

        ctx.close();
    }
}
