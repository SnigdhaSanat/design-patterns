package ObserverPattern.Interfaces;

public interface Observable {
    public void registerObserver(Observer observer);
    public void unRegisterObserver(Observer observer);
    //It notifies ALL observers
    public void notifyAllObservers();

}
