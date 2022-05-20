public class Main {

    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();

        Observer o1 = new ObserverImpl2();
        Observer o2 = new ObserverImpl2();
        Observer o3 = new ObserverImpl2();

        observable.addObserver(o1);
        observable.addObserver(o2);
        observable.addObserver(o3);

        observable.setEtat(55);
        observable.setEtat(30);
        observable.setEtat(33);

    }
}
