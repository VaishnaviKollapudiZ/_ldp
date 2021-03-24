package designpatterns.strategypattern;

public class CheckOut {

    private MyCart myCart;

    public CheckOut(MyCart myCart){
        this.myCart = myCart;
    }
    public void pay(PaymentStrategy paymentMethod){
        int amount = myCart.calculateTotal();
        paymentMethod.pay(amount);
    }
}
