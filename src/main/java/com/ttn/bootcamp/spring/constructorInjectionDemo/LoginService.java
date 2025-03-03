package com.ttn.bootcamp.spring.constructorInjectionDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {

    AuthenticationService authenticationService;

    @Autowired
    public LoginService(AuthenticationService authenticationService){
        this.authenticationService=authenticationService;
    }

    public void login(){
        authenticationService.authenticate();
        System.out.println("Logged in successfully.");
    }
}
