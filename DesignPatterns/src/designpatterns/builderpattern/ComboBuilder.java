package designpatterns.builderpattern;

public interface ComboBuilder {

    public void addBurger();
    public void addSoftDrink();
    public void addFries();
    public void addPrice();
    public MealCombo getMealCombo();
}
