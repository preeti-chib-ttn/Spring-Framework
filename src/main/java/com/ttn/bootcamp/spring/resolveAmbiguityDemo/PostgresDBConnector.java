package com.ttn.bootcamp.spring.resolveAmbiguityDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgresDBConnector  implements DatabaseConnector {

    public void connect(){
        System.out.println("Connected to postgres database.");
    }
}