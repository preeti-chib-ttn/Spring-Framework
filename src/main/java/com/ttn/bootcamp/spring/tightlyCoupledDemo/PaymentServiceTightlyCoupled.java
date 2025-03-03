package com.ttn.bootcamp.spring.tightlyCoupledDemo;

public class PaymentServiceTightlyCoupled {
    boolean makePayment(long orderId){
        System.out.println("Payment done for order: "+orderId);
        return true;
    }
}
