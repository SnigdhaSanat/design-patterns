
package ObserverPattern;

import ObserverPattern.Observable.Scoreboard;
import ObserverPattern.Observers.HotstarScoreElement;
import ObserverPattern.Observers.StarSports;

public class Simulator {


    public static void main(String args[])
    {
        Scoreboard scoreboard=new Scoreboard();

        //passing the Observable to the constructors of Observer
        HotstarScoreElement hotstarScoreElement=new HotstarScoreElement(scoreboard);
        StarSports starSports=new StarSports(scoreboard);

        //Simulate change in state
        scoreboard.setState(25, 2,4);

    }//main
}
// Java code to demonstrate addObserver() method
