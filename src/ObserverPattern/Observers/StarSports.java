package ObserverPattern.Observers;

import ObserverPattern.Interfaces.Observable;
import ObserverPattern.Interfaces.Observer;
import ObserverPattern.Observable.Scoreboard;

public class StarSports implements Observer {

	Observable observable;

	/*declare the states here. Note that this is s SUBSET of states this concrete observer needs */
	private int runs;
	private int wickets;

	public StarSports(Observable observable){
		this.observable=observable;
		System.out.println("Registering StarSports as an observer in constructor");
		observable.registerObserver(this);
	}

	@Override
	public void update() {
		if(this.observable instanceof Scoreboard){
			System.out.println("StarSports's update() called");
			Scoreboard scoreboard=(Scoreboard)this.observable;

			System.out.println("Setting runs and wickets");
			this.runs=scoreboard.getRuns();
			this.wickets=scoreboard.getWickets();
			display();
		}//if
	}

	void display(){
		System.out.println("Display method in StarSports");
		System.out.println("Run:"+ this.runs);
		System.out.println("Wickets:"+ this.wickets);
	}
}
