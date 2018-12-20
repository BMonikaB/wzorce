package obserwator.Observer;

import obserwator.Observalbe.WeatherForecast;

public class Tv implements Observer {
    public void update(WeatherForecast weatherForecast) {
        System.out.println("TV - Temperatura wynosi : " + weatherForecast.getTemperature() + " , a cisnienie wynosi : " + weatherForecast.getPressure());
    }
}
