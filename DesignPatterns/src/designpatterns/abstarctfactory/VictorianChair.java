package designpatterns.abstarctfactory;

public class VictorianChair implements Chair{
    @Override
    public void getPrice() {
        System.out.println("Victorian chair costs Rs.3500 ");
    }

    @Override
    public void checkRecliner() {
        System.out.println("Victorian Chair does not have recliners");
    }
}
