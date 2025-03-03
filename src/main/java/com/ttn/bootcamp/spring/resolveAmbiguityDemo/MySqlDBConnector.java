package com.ttn.bootcamp.spring.resolveAmbiguityDemo;

import org.springframework.stereotype.Component;

@Component
public class MySqlDBConnector implements DatabaseConnector {

    public void connect(){
        System.out.println("Connected to mysql database.");
    }
}
