package StrategyPattern.Interfaces;

public class Zomato implements FoodDeliveryBehaviour {
    @Override
    public void deliverFood() {
        System.out.println("Delivering with Zomato");
    }
}
