package IteratorPattern.Collection;

import IteratorPattern.Item.Flight;
import IteratorPattern.Iterators.FlightIterator;
import IteratorPattern.Iterators.GoFirstFlightsIterator;

public class GoFirstFlights {
	//implements an Array of flights
	int maxFlights=4;
	Flight[] goFirstFlights;
	int nextIndex =0;

	public GoFirstFlights(){
		goFirstFlights=new Flight[maxFlights];
		addFlights("Bengaluru", "Kolkata",2.5,"onTime");
		addFlights("Chennai", "Mumbai",2,"onTime");
		addFlights("Hyderabad", "Delhi",2.33,"delayed");
		addFlights("Mumbai", "Bengaluru",1.66,"onTime");
	}
	public void addFlights(String source, String destination, double duration, String status){
		if(nextIndex <maxFlights){
			goFirstFlights[nextIndex]=new Flight( source,  destination,  duration,  status);
			nextIndex +=1;
		}
		else{
			System.out.println("No more flights can be added");
		}
	}

	public Flight[] getGoFirstFlights(){
		System.out.println("getGoFirstFlights()");
		return goFirstFlights;
	}

	public FlightIterator getIterator(){
		return new GoFirstFlightsIterator(goFirstFlights);
	}

}
