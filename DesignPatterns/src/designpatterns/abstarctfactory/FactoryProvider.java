package designpatterns.abstarctfactory;

public class FactoryProvider {

    public static AbstractFurnitureFactory getFactory(String choice){
        switch(choice){

            case "Victorian": return new VictorianFactory();

            case "Modern" : return new ModernFactory();

            default: return null;
        }
    }
}
