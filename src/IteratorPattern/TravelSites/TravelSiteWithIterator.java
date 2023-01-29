package IteratorPattern.TravelSites;

import IteratorPattern.Collection.GoFirst;
import IteratorPattern.Collection.Indigo;
import IteratorPattern.Item.Flight;
import IteratorPattern.Iterators.FlightIterator;

public class TravelSiteWithIterator {
	Indigo indigo;
	GoFirst goFirst;

	public TravelSiteWithIterator(Indigo indigoParam, GoFirst goFirstParam){
		indigo = indigoParam;
		goFirst = goFirstParam;
	}
	public void getAllFlights(){
		//Implementation agnostic

		FlightIterator indigoFlightsIterator= indigo.getIterator();
		System.out.println("Indigo flights(with iterator)");
		while(indigoFlightsIterator.hasNext()){
			Flight indigoFlight=indigoFlightsIterator.next();
			System.out.println("Source:"+indigoFlight.getSource()+" Destination:"+indigoFlight.getDestination()+" Duration:"+indigoFlight.getDuration()+" Status:"+indigoFlight.getStatus());
		}

		System.out.println();

		FlightIterator goFirstFlightsIterator= goFirst.getIterator();
		System.out.println("GoFirst flights(with iterator)");
		while(goFirstFlightsIterator.hasNext()){
			Flight goFirstFlight=goFirstFlightsIterator.next();
			System.out.println("Source:"+goFirstFlight.getSource()+" Destination:"+goFirstFlight.getDestination()+" Duration:"+goFirstFlight.getDuration()+" Status:"+goFirstFlight.getStatus());
		}
	}//getAllFlights
}
