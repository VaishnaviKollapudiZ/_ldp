package designpatterns.builderpattern;

public class VegCombo implements ComboBuilder{

    private MealCombo vegMealCombo;

    public VegCombo(){
        this.vegMealCombo = new MealCombo();
    }
    @Override
    public void addBurger() {
        vegMealCombo.setBurger("Veg Cheese Burger");
    }

    @Override
    public void addSoftDrink() {
        vegMealCombo.setSoftDrink("Coke");
    }

    @Override
    public void addFries() {
        vegMealCombo.setFries("French Fries with piri piri");
    }

    @Override
    public void addPrice() {
        vegMealCombo.setPrice(399);
    }
    public MealCombo getMealCombo(){
        return this.vegMealCombo;
    }


}
