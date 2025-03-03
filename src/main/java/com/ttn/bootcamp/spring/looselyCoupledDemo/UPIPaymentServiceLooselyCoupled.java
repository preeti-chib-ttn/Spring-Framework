package com.ttn.bootcamp.spring.looselyCoupledDemo;

public class UPIPaymentServiceLooselyCoupled implements  PaymentServiceLooselyCoupled{
    public boolean makePayment(long orderId){
        System.out.println("Payment done using UPI for order: "+orderId);
        return  true;
    }
}
