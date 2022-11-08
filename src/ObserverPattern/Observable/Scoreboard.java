package ObserverPattern.Observable;

import ObserverPattern.Interfaces.Observable;
import ObserverPattern.Interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

public class Scoreboard implements Observable {

    List<Observer> observerList;

    /*declare the states here. Note that this is the UNIVERSAL set of states any observer will ever need */
    private int runs;
    private int wickets;
    private int overs;

    public Scoreboard(){
        observerList=new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Register method in observer");
        observerList.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        System.out.println("Unregister method in observer");
        int index=observerList.indexOf(observer);
        if(index>=0){
            observerList.remove(index);
        }
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer:observerList){
            /*Note that update() does not pass states to the observer. The observer PULLS them if it requires to,
            * using the getter methods. This gives flexibility to the observer to get the states it needs, whenever it needs.*/
            observer.update();
        }//for
    }

    //This is called from the Simulator for demo
    public void setState(int runs, int wickets, int overs){
        System.out.println("Setting state, and notifying all the observers");
        this.runs=runs;
        this.wickets=wickets;
        this.overs=overs;
        notifyAllObservers();
    }


    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public int getOvers() {
        return overs;
    }
}
