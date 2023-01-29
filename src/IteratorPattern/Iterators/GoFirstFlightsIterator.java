package IteratorPattern.Iterators;

import IteratorPattern.Item.Flight;

public class GoFirstFlightsIterator implements FlightIterator {

	int maxFlights=4;
	Flight[] goFirstFlights;
	int nextIndex =0;

	public GoFirstFlightsIterator(Flight[] goFirstFlightsParam){
		goFirstFlights=new Flight[maxFlights];
		goFirstFlights=goFirstFlightsParam;
	}
	@Override
	public Flight next() {
		Flight flight= goFirstFlights[nextIndex];
		nextIndex+=1;
		return flight;
	}

	@Override
	public boolean hasNext() {
		if(nextIndex<goFirstFlights.length){
			return true;
		}
		return false;
	}
}
