package StrategyPattern.Clients;

import StrategyPattern.Interfaces.Zomato;

public class HydBranch extends RestaurantBranches {
    public HydBranch(){
        System.out.println("Hello from HydBranch");

        //this is where the concrete implementation of FoodDeliveryBehaviour is assigned.
        foodDeliveryBehaviour =new Zomato();
    }
}
