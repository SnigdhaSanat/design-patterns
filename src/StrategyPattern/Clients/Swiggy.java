package StrategyPattern.Clients;

import StrategyPattern.Interfaces.DebitCard;

public class Swiggy extends FoodDeliveryApp {
    public Swiggy(){
        //this is where the concrete implementation is assigned.
        System.out.println("Hello from Swiggy");
        paymentBehaviour =new DebitCard();
    }
}
