package obserwator.Observalbe;

import java.util.HashSet;
import java.util.Set;

import obserwator.Observer.Observer;

public class WeatherForecast implements Observalbe {


    private int temperature;
    private int pressure;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : registeredObservers) {
            o.update(this);
        }
    }

    public void updateForecast(int temp, int cis) {
        setTemperature(temp);
        setPressure(cis);
        notifyObservers();
    }
}
