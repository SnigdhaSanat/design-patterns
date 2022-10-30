package StrategyPattern.Clients;

import StrategyPattern.Interfaces.PaymentBehaviour;

public abstract class FoodDeliveryApp {

    /*The FoodDeliveryApp HAS A PaymentBehaviour class. This is called composition.

    The concrete implementation of paymentBehaviour will be assigned in its subclasses, Swiggy/Zomato.
    Any changes in the internal concrete implementation is encapsulated into PaymentBehaviour, and simply needs to be reused by the
    FoodDeliveryApp, while at the same time keeping changes of PaymentBehaviour flexible. This reusability plus the ease of extension forms
    the crux of the Strategy pattern.*/

 PaymentBehaviour paymentBehaviour;

 public FoodDeliveryApp(){

 }

 public void pay(){
     /*This is called from its subclasses, after assigning the concrete implementation in its subclasses.
     But note that the delegation happens here. The FoodDeliveryApp delegates the the responsibility of payment to PaymentBehaviour*/
     paymentBehaviour.makePayment();
 }
}
