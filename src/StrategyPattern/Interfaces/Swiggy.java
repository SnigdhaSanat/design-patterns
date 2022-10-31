package StrategyPattern.Interfaces;

public class Swiggy implements FoodDeliveryBehaviour {

    @Override
    public void deliverFood() {
        System.out.println("Delivering with Swiggy");
    }
}
