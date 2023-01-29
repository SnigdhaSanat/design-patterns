package IteratorPattern.Collection;

import IteratorPattern.Item.Flight;
import IteratorPattern.Iterators.FlightIterator;
import IteratorPattern.Iterators.IndigoFlightsIterator;

import java.util.ArrayList;

public class IndigoFlights {
	//Implements an Arraylist of flights
	ArrayList<Flight> indigoFlights;

	public IndigoFlights(){
		indigoFlights=new ArrayList<>();
		addFlight("Bengaluru", "Hyderabad",1.25,"onTime");
		addFlight("Delhi", "Bengaluru",2.83,"onTime");
		addFlight("Mumbai", "Kolkata",2.66,"onTime");
		addFlight("Chennai", "Delhi",2.83,"onTime");
	}


	public void addFlight(String source, String destination, double duration, String status){
	indigoFlights.add(new Flight(source,destination,duration,status));
	}

	public ArrayList<Flight> getIndigoFlights(){
		System.out.println("getIndigoFlights()");
		return indigoFlights;
	}

	public FlightIterator getIterator(){
		return new IndigoFlightsIterator(indigoFlights);
	}

}
