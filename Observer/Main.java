public class Main {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.notifyObservers();

        subject.removeObserver(observer1);
        subject.notifyObservers();
    }

}
