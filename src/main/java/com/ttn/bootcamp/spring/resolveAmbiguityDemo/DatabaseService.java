package com.ttn.bootcamp.spring.resolveAmbiguityDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService {

    DatabaseConnector databaseConnector;
    @Autowired
    public DatabaseService(DatabaseConnector databaseConnector){
        this.databaseConnector=databaseConnector;
    }
    public void getData(){
        databaseConnector.connect();
        System.out.println("We got some data from database service.");
    }
}
