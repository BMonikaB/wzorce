package obserwator;

import obserwator.Observalbe.WeatherForecast;
import obserwator.Observer.Internet;
import obserwator.Observer.Radio;
import obserwator.Observer.Tv;

public class Test {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(20,40);

        Internet internet = new Internet();
        Radio radio = new Radio();
        Tv tv = new Tv();

       weatherForecast.registerObserver(internet);
       weatherForecast.registerObserver(tv);
       weatherForecast.registerObserver(radio);

       weatherForecast.notifyObservers();

       weatherForecast.unregisterObserver(internet);

       System.out.println("Nowe");
       weatherForecast.updateForecast(1,2);




    }
}
