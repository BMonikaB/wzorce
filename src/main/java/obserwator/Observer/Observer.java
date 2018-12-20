package obserwator.Observer;

import obserwator.Observalbe.Observalbe;
import obserwator.Observalbe.WeatherForecast;

public interface Observer {

    void update(WeatherForecast weatherForecast);

}
