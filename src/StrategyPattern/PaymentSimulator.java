package StrategyPattern;

import StrategyPattern.Clients.FoodDeliveryApp;
import StrategyPattern.Clients.Swiggy;
import StrategyPattern.Clients.Zomato;

public class PaymentSimulator {
    public static void main(String[] args) {

        FoodDeliveryApp swiggy=new Swiggy();
        /* Effectively, this calls the inherited pay() method of the class FoodDeliveryApp.Now that the concrete paymentAlgo is already
        assigned to the Swiggy class, the FoodDeliveryApp base class, within the pay method, calls makePayment() method with that
        concrete implementation*/
        swiggy.pay();


        FoodDeliveryApp zomato=new Zomato();
        // Same as above
        zomato.pay();
    }
}
