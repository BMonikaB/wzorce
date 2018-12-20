package obserwator.Observalbe;

import obserwator.Observer.Observer;

public interface Observalbe {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
