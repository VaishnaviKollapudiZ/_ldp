package designpatterns.observerpattern;

import java.util.ArrayList;

public class WeatherData implements  Subject{

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float wind;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int position = observers.indexOf(observer);
        if(position >= 0){
            observers.remove(position);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(temperature,humidity,wind);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature,float humidity,float wind){
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        measurementsChanged();
    }
}
