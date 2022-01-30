package main.dependency_injection;

import com.example.field_injection.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();

        Singer singerBean = ctx.getBean(Singer.class);
        singerBean.sing();

        ctx.close();
    }
}
