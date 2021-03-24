package designpatterns.abstarctfactory; // Creational Design Pattern

import java.util.Scanner;
//MAIN METHOD
public class TestFactoryProvider {
        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            System.out.println("Which type of furniture do you want:\nModern? or Victorian?");
            String factoryName = scan.nextLine();

            AbstractFurnitureFactory furnitureFactory = FactoryProvider.getFactory(factoryName);

            //assert furnitureFactory != null;
            Chair chair = furnitureFactory.getChair();
            chair.getPrice();
            chair.checkRecliner();

            Sofa sofa = furnitureFactory.getSofa();
            sofa.getPrice();
            sofa.getCushionFilling();
        }
}
