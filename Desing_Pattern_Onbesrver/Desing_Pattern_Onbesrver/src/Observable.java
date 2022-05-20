public interface Observable {


    void addObserver(Observer o); // subscribe
    void removeObserver(Observer o);
    void notifyObservers();

}
