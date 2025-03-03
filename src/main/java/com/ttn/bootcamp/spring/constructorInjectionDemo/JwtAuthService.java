package com.ttn.bootcamp.spring.constructorInjectionDemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JwtAuthService implements  AuthenticationService{
    public void authenticate(){
        System.out.println("Authentication done using JWT");
    }
}
