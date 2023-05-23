package ObserverPattern.Observers;

import ObserverPattern.Interfaces.Observable;
import ObserverPattern.Interfaces.Observer;
import ObserverPattern.Observable.Scoreboard;

public class HotstarScoreElement implements Observer {

	Observable observable;

	/**declare the states here. Note that this is s SUBSET of states this concrete observer needs */
	private int runs;
	private int overs;

	public HotstarScoreElement(Observable observable){
		this.observable=observable;
		System.out.println("Registering HotstarScoreElement as an observer in constructor");
		observable.registerObserver(this);
	}

	@Override
	public void update() {
		if(this.observable instanceof Scoreboard){
			System.out.println("HotstarScoreElement's update() called");
			Scoreboard scoreboard=(Scoreboard)this.observable;

			System.out.println("Setting runs and overs");
			this.runs=scoreboard.getRuns();
			this.overs=scoreboard.getOvers();
			display();
		}//if
	}

	void display(){
		System.out.println("Display method in HotstarScoreElement");
		System.out.println("Run:"+ this.runs);
		System.out.println("Overs:"+ this.overs);
	}
}
