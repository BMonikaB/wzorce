package obserwator.Observer;

import obserwator.Observalbe.WeatherForecast;

public class Internet implements Observer {
    public void update(WeatherForecast weatherForecast) {

        System.out.println("Internet - Temperatura wynosi : " + weatherForecast.getTemperature() + " , a cisnienie wynosi : " + weatherForecast.getPressure());

    }
}
