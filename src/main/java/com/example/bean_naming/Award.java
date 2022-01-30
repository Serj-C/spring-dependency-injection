package com.example.bean_naming;

import org.springframework.core.annotation.AliasFor;

public @interface Award {
    @AliasFor("prize")
    String[] value() default {};

    @AliasFor("value")
    String[] prize() default {};
}
