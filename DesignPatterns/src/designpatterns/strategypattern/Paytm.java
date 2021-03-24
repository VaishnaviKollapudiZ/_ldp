package designpatterns.strategypattern;

public class Paytm implements PaymentStrategy{

    private String phoneNumber;

    public Paytm(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println(amount+" sent to "+phoneNumber);
    }
}
