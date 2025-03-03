package com.ttn.bootcamp.spring.constructorInjectionDemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OAuthService implements  AuthenticationService{
    public void authenticate(){
        System.out.println("Authentication done using OAuth");
    }
}
