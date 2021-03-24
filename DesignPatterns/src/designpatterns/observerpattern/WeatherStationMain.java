package designpatterns.observerpattern;//Behavioural Design Pattern
//MAIN METHOD
public class WeatherStationMain {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(31,37,10);
        weatherData.setMeasurements(33,39,13);
    }
}
