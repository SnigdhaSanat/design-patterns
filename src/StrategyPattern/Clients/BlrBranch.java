package StrategyPattern.Clients;

import StrategyPattern.Interfaces.Swiggy;

public class BlrBranch extends RestaurantBranches {
    public BlrBranch(){
        System.out.println("Hello from BlrBranch");

        //this is where the concrete implementation of FoodDeliveryBehaviour is assigned.
        foodDeliveryBehaviour =new Swiggy();
    }
}
