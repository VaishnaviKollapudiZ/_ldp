package designpatterns.builderpattern;

public class MealDirector {
    private ComboBuilder comboBuilder;

    public MealDirector(ComboBuilder comboBuilder){
        this.comboBuilder = comboBuilder;
    }
    public MealCombo getMealCombo(){
        return this.comboBuilder.getMealCombo();
    }
    public void buildMeal(){
        this.comboBuilder.addBurger();
        this.comboBuilder.addSoftDrink();
        this.comboBuilder.addFries();
        this.comboBuilder.addPrice();
    }
}
