package main.dependency_injection;

import com.example.bean_naming.Singer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Map;

public class AliasConfigDemo {

    @Configuration
    public static class AliasBeanConfig {
        @Bean(name = {"johnMeyer", "john", "jonathan", "johnny"})
        public Singer singer() {
            return new Singer();
        }
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AliasBeanConfig.class);

        Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);
        beans.forEach((key, value) ->
                System.out.println("id: " + key
                        + "\n aliases: " + Arrays.toString(ctx.getAliases(key)) + '\n')
        );
    }
}
