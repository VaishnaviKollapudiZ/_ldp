package designpatterns.strategypattern;

import java.util.Date;

public class CreditCard implements PaymentStrategy{

    private String cardNumber;
    private String cardHolderName;
    private String cvv;
    private String expiryDate;

    public CreditCard(String cardHolderName, String cardNumber, String cvv, String expiryDate){
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }
    @Override
    public void pay(double amount) {
        System.out.println(amount +" paid with credit card");
    }
}
