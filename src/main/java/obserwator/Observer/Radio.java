package obserwator.Observer;

import obserwator.Observalbe.WeatherForecast;

public class Radio implements Observer {
    public void update(WeatherForecast weatherForecast) {

        System.out.println("Radio - Temperatura wynosi : " + weatherForecast.getTemperature() + " , a cisnienie wynosi : " + weatherForecast.getPressure());

    }
}
