package designpatterns.abstarctfactory;

public class VictorianSofa implements Sofa{


    @Override
    public void getPrice() {
        System.out.println("Victorian Sofa costs Rs.5600");
    }

    @Override
    public void getCushionFilling() {
        System.out.println("Victorian sofa's cushion filling material is Hollow-Fill fiber.");
    }
}
