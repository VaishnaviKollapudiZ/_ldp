package designpatterns.builderpattern;//Creational Design Pattern

//MAIN METHOD
public class BuilderMain {
    public static void main(String[] args){

        ComboBuilder comboBuilder = new VegCombo();
        MealDirector mealDirector = new MealDirector(comboBuilder);
        mealDirector.buildMeal();
        MealCombo mealCombo = mealDirector.getMealCombo();
        System.out.println(mealCombo);
    }
}
