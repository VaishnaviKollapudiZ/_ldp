package designpatterns.abstarctfactory;

public class ModernFactory implements AbstractFurnitureFactory {
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }
}
