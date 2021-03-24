package designpatterns.abstarctfactory;

public class VictorianFactory implements AbstractFurnitureFactory {
    @Override
    public Chair getChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }
}
