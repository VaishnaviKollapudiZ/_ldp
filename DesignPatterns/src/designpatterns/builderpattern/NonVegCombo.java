package designpatterns.builderpattern;

public class NonVegCombo implements ComboBuilder{

    private MealCombo nonVegMealCombo;

    public NonVegCombo(){
        this.nonVegMealCombo = new MealCombo();
    }
    @Override
    public void addBurger() {
        nonVegMealCombo.setBurger("Chicken Burger");
    }

    @Override
    public void addSoftDrink() {
        nonVegMealCombo.setSoftDrink("Sprite");
    }

    @Override
    public void addFries() {
        nonVegMealCombo.setFries("French Wedges");
    }

    @Override
    public void addPrice() {
        nonVegMealCombo.setPrice(499);
    }
    public MealCombo getMealCombo(){
        return this.nonVegMealCombo;
    }
}
