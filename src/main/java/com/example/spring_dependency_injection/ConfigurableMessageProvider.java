package com.example.spring_dependency_injection;

import org.springframework.stereotype.Service;

// simple bean
@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    //@Autowired // Constructor injection
    public ConfigurableMessageProvider(/*@Value("Configurable message") */String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
