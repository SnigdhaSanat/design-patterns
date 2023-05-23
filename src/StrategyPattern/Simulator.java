package StrategyPattern;

import StrategyPattern.Clients.BlrBranch;
import StrategyPattern.Clients.HydBranch;
import StrategyPattern.Clients.RestaurantBranches;

public class Simulator {
    public static void main(String[] args) {

        RestaurantBranches blrBranch=new BlrBranch();
        /** Effectively, this calls the inherited deliver() method of the base class RestaurantBranches. Now that the concrete implementation
         of foodDeliveryBehaviour is already assigned in its subclasses, the RestaurantBranches base class, within its deliver method,
         calls deliverFood() method with that concrete implementation of foodDeliveryBehaviour*/
        blrBranch.deliver();


        RestaurantBranches hydBranch=new HydBranch();
        // Same logic as above
        hydBranch.deliver();
    }
}
