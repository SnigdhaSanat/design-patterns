package StrategyPattern.Interfaces;

public class UPI implements PaymentBehaviour {
    @Override
    public void makePayment() {
        System.out.println("Paying with UPI");
    }
}
