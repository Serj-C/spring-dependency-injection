package com.example.bean_naming;

import org.springframework.stereotype.Component;

@Component("johnMeyer")
@Trophy(name = {"grammy", "platinum disk"})
//@Award(value = {"grammy", "platinum disk"})
public class Singer {
    private String lyric = "We found a message in a bottle we were drinking";

    public void sing() {
        System.out.println(lyric);
    }
}
