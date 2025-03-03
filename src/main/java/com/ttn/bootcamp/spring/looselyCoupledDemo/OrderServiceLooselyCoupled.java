package com.ttn.bootcamp.spring.looselyCoupledDemo;

import java.util.Random;
import java.util.Scanner;

public class OrderServiceLooselyCoupled {

    PaymentServiceLooselyCoupled orderPaymentService;
    public OrderServiceLooselyCoupled(PaymentServiceLooselyCoupled paymentService){
        System.out.println("Loosely coupled payment service");
        orderPaymentService=paymentService;
    }

    public void placeOrder(int items, int price){
        Random randomNumber = new Random(1);
        long orderId = 100000 + randomNumber.nextInt(900000);
        System.out.println("Order with OrderId "+orderId+" and "+items+" items placed.\nTotal: "+price+" rupees.");
            if(!orderPaymentService.makePayment(orderId))
                System.out.println("Order cancelled.");
    }
}
