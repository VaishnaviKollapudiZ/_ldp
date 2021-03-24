package designpatterns.decoratorpattern;

public class Caramel extends CondimentDecorator{

    private Beverage beverage;

    public Caramel(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+30;
    }
}
