package IteratorPattern.Collection;

import IteratorPattern.Item.Flight;
import IteratorPattern.Iterators.FlightIterator;
import IteratorPattern.Iterators.GoFirstFlightsIterator;

public class GoFirst {
	//implements an Array of flights
	int maxFlights=4;
	Flight[] goFirstFlights;
	int nextIndex =0;

	public GoFirst(){
		goFirstFlights=new Flight[maxFlights];
		//call API actually
		addFlight("Bengaluru", "Kolkata",2.5,"onTime");
		addFlight("Chennai", "Mumbai",2,"onTime");
		addFlight("Hyderabad", "Delhi",2.33,"delayed");
		addFlight("Mumbai", "Bengaluru",1.66,"onTime");
	}
	public void addFlight(String source, String destination, double duration, String status){
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
