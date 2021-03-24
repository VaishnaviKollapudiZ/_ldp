package designpatterns.strategypattern;

import java.util.ArrayList;

public class MyCart {
    //List of items
    ArrayList<Item> items;

    public MyCart(){
        this.items=new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }


}
