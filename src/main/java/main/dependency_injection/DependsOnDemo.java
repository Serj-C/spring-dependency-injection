package main.dependency_injection;

import com.example.resolving_dependencies.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DependsOnDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

        // XML Config
        //ctx.load("classpath:/spring/resolving_dependencies/app-context-01.xml");

        // Annotations Config
        ctx.load("classpath:/spring/resolving_dependencies/app-context-02.xml");

        ctx.refresh();

        Singer singer = ctx.getBean("johnMayer", Singer.class);
        singer.sing();

        ctx.close();
    }
}
