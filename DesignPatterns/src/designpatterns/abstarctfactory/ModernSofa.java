package designpatterns.abstarctfactory;

public class ModernSofa implements Sofa{

    @Override
    public void getPrice( ) {
        System.out.println("Modern Sofa costs Rs.4600");

    }
    @Override
    public void getCushionFilling() {
        System.out.println("Modern Sofa's Cushion filling material is Foam ");
    }
}
