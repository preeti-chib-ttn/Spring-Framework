package com.ttn.bootcamp.spring.beansDemo;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private int age;

    Person(){
        name="Preeti";
        age=23;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
