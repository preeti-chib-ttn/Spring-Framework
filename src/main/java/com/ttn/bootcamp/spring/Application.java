package com.ttn.bootcamp.spring;

import com.ttn.bootcamp.spring.autowiredDemo.BinarySearch;
import com.ttn.bootcamp.spring.autowiredDemo.QuickSort;
import com.ttn.bootcamp.spring.beansDemo.Person;
import com.ttn.bootcamp.spring.constructorInjectionDemo.LoginService;
import com.ttn.bootcamp.spring.constructorInjectionDemo.OAuthService;
import com.ttn.bootcamp.spring.looselyCoupledDemo.OrderServiceLooselyCoupled;
import com.ttn.bootcamp.spring.looselyCoupledDemo.RazorPaymentServiceLooselyCoupled;
import com.ttn.bootcamp.spring.resolveAmbiguityDemo.DatabaseService;
import com.ttn.bootcamp.spring.resolveAmbiguityDemo.MySqlDBConnector;
import com.ttn.bootcamp.spring.tightlyCoupledDemo.OrderServiceTightlyCoupled;
import com.ttn.bootcamp.spring.tightlyCoupledDemo.PaymentServiceTightlyCoupled;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

        // Question 1: Write a program to demonstrate Tightly Coupled code.
        OrderServiceTightlyCoupled orderServiceTightlyCoupled =
                new OrderServiceTightlyCoupled(new PaymentServiceTightlyCoupled());
        orderServiceTightlyCoupled.placeOrder(10,3000);

        // Question 2: Write a program to demonstrate Loosely Coupled code.
        OrderServiceLooselyCoupled orderServiceLooselyCoupled =
                new OrderServiceLooselyCoupled(new RazorPaymentServiceLooselyCoupled());
        orderServiceLooselyCoupled.placeOrder(20,40000);

        // Question 3: Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management
        BinarySearch binarySearch= new BinarySearch(new QuickSort());
        binarySearch.search(new int[]{11,23,1,13,5,36},6,11);

       // Question 4: Get a Spring Bean from application context and display its properties.
        Person person= context.getBean(Person.class);
        System.out.println("The details of person");
        System.out.println(person.getName()+" is "+person.getAge()+" years old.");

        //Question 5: Demonstrate how you will resolve ambiguity while autowiring bean
        DatabaseService databaseService= new DatabaseService(new MySqlDBConnector());
        databaseService.getData();

        //Question 6: Perform Constructor Injection in a Spring Bean
        OAuthService authenticationService = new OAuthService();
        LoginService loginService= new LoginService(authenticationService);
        loginService.login();

	}

}
