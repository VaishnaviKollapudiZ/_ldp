package designpatterns.observerpattern;

public class CurrentConditionDisplay implements DisplayElement,Observer{

    private float temperature;
    private float humidity;
    private float wind;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temperature, float humidity, float wind) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: \n"+temperature+"C degrees\n"+humidity+" % humidity\n"+wind+" km/hr wind");
    }

}
