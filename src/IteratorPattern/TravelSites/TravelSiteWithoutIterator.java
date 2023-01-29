package IteratorPattern.TravelSites;

import IteratorPattern.Collection.IndigoFlights;
import IteratorPattern.Collection.GoFirstFlights;
import IteratorPattern.Item.Flight;

import java.util.ArrayList;

public class TravelSiteWithoutIterator {
	IndigoFlights indigoFlights;
	GoFirstFlights goFirstFlights;

	public TravelSiteWithoutIterator(IndigoFlights indigoFlightsParam, GoFirstFlights goFirstFlightsParam){
		this.indigoFlights = indigoFlightsParam;
		this.goFirstFlights = goFirstFlightsParam;
	}
	public void getAllFlights(){
		//Implemented an an arraylist
		ArrayList<Flight> indigoFlights= this.indigoFlights.getIndigoFlights();
		System.out.println("Indigo flights(without iterator)");
		for(Flight indigoFlight:indigoFlights){
			System.out.println("Source:"+indigoFlight.getSource()+" Destination:"+indigoFlight.getDestination()+" Duration:"+indigoFlight.getDuration()+" Status:"+indigoFlight.getStatus());
		}

		System.out.println();
		//Implemented an an array
		Flight[] goFirstFlights= this.goFirstFlights.getGoFirstFlights();
		System.out.println("GoFirst flights(without iterator)");
		for(Flight goFirstFlight:goFirstFlights){
			System.out.println("Source:"+goFirstFlight.getSource()+" Destination:"+goFirstFlight.getDestination()+" Duration:"+goFirstFlight.getDuration()+" Status:"+goFirstFlight.getStatus());
		}
	}//getAllFlights
}//Client
