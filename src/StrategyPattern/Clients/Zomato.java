package StrategyPattern.Clients;

import StrategyPattern.Interfaces.UPI;

public class Zomato extends FoodDeliveryApp {
    public Zomato(){
        //this is where the concrete implementation is assigned
        System.out.println("Hello from Zomato");
        paymentBehaviour =new UPI();
    }
}
