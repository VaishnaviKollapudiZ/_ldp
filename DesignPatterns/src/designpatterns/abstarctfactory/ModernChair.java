package designpatterns.abstarctfactory;

public class ModernChair implements Chair{
    @Override
    public void getPrice() {
        System.out.println("Modern Chair costs Rs.2500");
    }

    @Override
    public void checkRecliner() {
        System.out.println("Modern Chair has Recliners");
    }
}
