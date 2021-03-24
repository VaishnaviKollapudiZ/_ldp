package designpatterns.builderpattern;

public class MealCombo {

    private String burger;
    private String fries;
    private String softDrink;
    private double price;
    public void setBurger(String burger) {
        this.burger = burger;
    }

    public void setFries(String fries) {
        this.fries = fries;
    }

    public void setSoftDrink(String softDrink) {
        this.softDrink = softDrink;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBurger() {
        return burger;
    }

    public String getFries() {
        return fries;
    }

    public String getSoftDrink() {
        return softDrink;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Burger: "+getBurger()+"\n Fries: "+getFries()+"\n Soft Drink: "+getSoftDrink()+"\n Total Price = "+getPrice();
    }
}
