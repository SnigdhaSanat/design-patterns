package StrategyPattern.Clients;

import StrategyPattern.Interfaces.FoodDeliveryBehaviour;

public abstract class RestaurantBranches {

    /**The RestaurantBranches HAS A FoodDeliveryBehaviour. This is called composition.

    The concrete implementation of FoodDeliveryBehaviour will be assigned in its subclasses, BlrBranch and HydBranch.
    Any changes in its internal concrete implementation is encapsulated into FoodDeliveryBehaviour, and simply needs to be reused by the
    RestaurantBranches, while at the same time keeping changes of FoodDeliveryBehaviour flexible. This reusability plus the ease of extension forms
    the crux of the Strategy pattern.*/

 FoodDeliveryBehaviour foodDeliveryBehaviour;

 public RestaurantBranches(){

 }


 public void deliver(){
     /**deliver() method is called after assigning the concrete implementation in its subclasses.
     But note that the delegation happens here. The RestaurantBranches delegates the the responsibility of food delivery to FoodDeliveryBehaviour*/
     foodDeliveryBehaviour.deliverFood();
 }
}
