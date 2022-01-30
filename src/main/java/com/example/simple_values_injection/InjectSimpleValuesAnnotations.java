package com.example.simple_values_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("simpleValuesAnnotations")
public class InjectSimpleValuesAnnotations {
    @Value("John Meyer")
    private String name;
    @Value("39")
    private int age;
    @Value("1.92")
    private float height;
    @Value("false")
    private boolean programmer;
    @Value("1241401112")
    private Long ageInSeconds;

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Is Programmer?: " + programmer;
    }
}
