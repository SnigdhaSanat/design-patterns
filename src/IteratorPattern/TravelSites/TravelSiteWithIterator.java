package IteratorPattern.TravelSites;

import IteratorPattern.Collection.GoFirstFlights;
import IteratorPattern.Collection.IndigoFlights;
import IteratorPattern.Item.Flight;
import IteratorPattern.Iterators.FlightIterator;

import java.util.ArrayList;

public class TravelSiteWithIterator {
	IndigoFlights indigoFlights;
	GoFirstFlights goFirstFlights;

	public TravelSiteWithIterator(IndigoFlights indigoFlightsParam, GoFirstFlights goFirstFlightsParam){
		indigoFlights = indigoFlightsParam;
		goFirstFlights = goFirstFlightsParam;
	}
	public void getAllFlights(){
		//Implementation agnostic

		FlightIterator indigoFlightsIterator=indigoFlights.getIterator();
		System.out.println("Indigo flights(with iterator)");
		while(indigoFlightsIterator.hasNext()){
			Flight indigoFlight=indigoFlightsIterator.next();
			System.out.println("Source:"+indigoFlight.getSource()+" Destination:"+indigoFlight.getDestination()+" Duration:"+indigoFlight.getDuration()+" Status:"+indigoFlight.getStatus());
		}

		System.out.println();

		FlightIterator goFirstFlightsIterator=goFirstFlights.getIterator();
		System.out.println("GoFirst flights(with iterator)");
		while(goFirstFlightsIterator.hasNext()){
			Flight goFirstFlight=goFirstFlightsIterator.next();
			System.out.println("Source:"+goFirstFlight.getSource()+" Destination:"+goFirstFlight.getDestination()+" Duration:"+goFirstFlight.getDuration()+" Status:"+goFirstFlight.getStatus());
		}
	}//getAllFlights
}
