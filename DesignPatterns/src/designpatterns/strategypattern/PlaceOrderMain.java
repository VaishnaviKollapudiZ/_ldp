package designpatterns.strategypattern; //Behavioural Design Pattern

//MAIN METHOD
public class PlaceOrderMain {

    public static void main(String[] args){


        MyCart  cart = new MyCart();

        Item item1 = new Item("1",250);
        Item item2 = new Item("2",300);

        cart.addItem(item1);
        cart.addItem(item2);
        System.out.println("AMOUNT TO BE PAID- "+cart.calculateTotal());


        CheckOut checkOut = new CheckOut(cart);
        PaymentStrategy paymentStrategy = new Paytm("7032779112");

//        PaymentStrategy paymentStrategy1 = new CreditCard("VAKULA.K","1234-5678-0998-7634","123","09-12-2022");
//        checkOut.pay(paymentStrategy1);
    }
}
