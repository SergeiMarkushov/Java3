package com.example.lesson7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // time of life
@Target(ElementType.METHOD) // set value for use (Methods)
public @interface MyAnnotation {
    int priority() default 5;
}
