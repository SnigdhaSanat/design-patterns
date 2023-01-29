package IteratorPattern.Iterators;

import IteratorPattern.Item.Flight;

import java.util.ArrayList;

public class IndigoFlightsIterator implements FlightIterator {
	ArrayList<Flight> indigoFlights;
	int nextPosition=0;

	public IndigoFlightsIterator(ArrayList<Flight> indigoFlightsParam){
		indigoFlights=indigoFlightsParam;
	}
	@Override
	public Flight next() {
		Flight flight= indigoFlights.get(nextPosition);
		nextPosition+=1;
		return flight;
	}

	@Override
	public boolean hasNext() {
	if(nextPosition<indigoFlights.size()){
		return true;
	}
	return false;
	}//hasNext
}
