package main.dependency_injection;

import com.example.bean_autowiring.Bar;
import com.example.bean_autowiring.complex.Foo;
import com.example.bean_autowiring.complex.FooImplOne;
import com.example.bean_autowiring.complex.FooImplTwo;
import main.dependency_injection.bean_autowiring.BeanAutowiringAnnotationsDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanAutowiringJavaConfig {
    @Configuration
    static class TargetConfig {
        @Bean
        public Foo fooImplOne() {
            return new FooImplOne();
        }

        @Bean
        public Foo fooImplTwo() {
            return new FooImplTwo();
        }

        @Bean
        public Bar bar() {
            return new Bar();
        }

        @Bean
        public BeanAutowiringAnnotationsDemo trickyTarget() {
            return new BeanAutowiringAnnotationsDemo();
        }
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TargetConfig.class);

        BeanAutowiringAnnotationsDemo instance = ctx.getBean(BeanAutowiringAnnotationsDemo.class);

        ctx.close();
    }
}
