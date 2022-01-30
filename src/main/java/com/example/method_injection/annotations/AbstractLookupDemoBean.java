package com.example.method_injection.annotations;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("abstractLookupBean")
public class AbstractLookupDemoBean implements DemoBean {

    @Lookup("singer")
    @Override
    public Singer getMySinger() {
        return null; //overriden dynamically
    }

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
