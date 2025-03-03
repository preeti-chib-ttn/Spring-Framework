package com.ttn.bootcamp.spring.looselyCoupledDemo;

public class RazorPaymentServiceLooselyCoupled implements  PaymentServiceLooselyCoupled{

    public boolean makePayment(long orderId){
        System.out.println("Payment done using razor pay for order: "+orderId);
        return  true;
    }
}
