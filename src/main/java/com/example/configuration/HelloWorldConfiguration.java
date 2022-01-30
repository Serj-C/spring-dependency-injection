package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// Any of the below can be used: @ComponentScan or @ImportResource - both specifying the package to scan
// @ComponentScan(basePackages = {"com.example.spring_app"})
@ImportResource(locations = {"classpath:spring/app-context-annotation.xml"})
@Configuration
public class HelloWorldConfiguration {

    /*@Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }*/
}
