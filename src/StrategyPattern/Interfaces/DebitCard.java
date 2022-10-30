package StrategyPattern.Interfaces;

public class DebitCard implements PaymentBehaviour {

    @Override
    public void makePayment() {
        System.out.println("Paying with DebitCard");

    }
}
