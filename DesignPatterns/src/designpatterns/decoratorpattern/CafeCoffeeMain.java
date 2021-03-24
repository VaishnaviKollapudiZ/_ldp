package designpatterns.decoratorpattern;//Structural Design Pattern

//MAIN METHOD
import java.util.Scanner;

public class CafeCoffeeMain {

    public static void main(String[] args){

        System.out.println("Cafe Coffee Menu");
        System.out.println("COFFEES \n"+"Espresso "+" Decaf "+" Dark Roast");
        System.out.println("EXTRA TOPPINGS :\n"+" Caramel "+" Whipped Cream");


        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription()+" Rs."+beverage.cost());


        Beverage beverage1 = new DarkRoast();
        beverage1 = new WhippedCream(beverage1);
        beverage1 = new Caramel(beverage1);
        System.out.println(beverage1.getDescription()+" Rs."+beverage1.cost());

    }
}
