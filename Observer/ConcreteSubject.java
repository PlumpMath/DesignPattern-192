import java.util.List;
import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    private List<Observer> observerRegistry = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerRegistry.add(observer);
        System.out.println("Observer registered : " + observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerRegistry.indexOf(observer);
        if (i >= 0) {
            observerRegistry.remove(i);
        }
        System.out.println("Observer removed : " + observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerRegistry) {
            observer.update();
        }
    }

    public void setState() {
        // ...
        notifyObservers();
    }

    public void getState() {
        // ...
    }

}
