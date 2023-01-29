package IteratorPattern.TravelSites;

import IteratorPattern.Collection.Indigo;
import IteratorPattern.Collection.GoFirst;
import IteratorPattern.Item.Flight;

import java.util.ArrayList;

public class TravelSiteWithoutIterator {
	Indigo indigo;
	GoFirst goFirst;

	public TravelSiteWithoutIterator(Indigo indigoParam, GoFirst goFirstParam){
		this.indigo = indigoParam;
		this.goFirst = goFirstParam;
	}
	public void getAllFlights(){
		//Implemented an an arraylist
		ArrayList<Flight> indigoFlights= this.indigo.getIndigoFlights();
		System.out.println("Indigo flights(without iterator)");
		for(Flight indigoFlight:indigoFlights){
			System.out.println("Source:"+indigoFlight.getSource()+" Destination:"+indigoFlight.getDestination()+" Duration:"+indigoFlight.getDuration()+" Status:"+indigoFlight.getStatus());
		}

		System.out.println();
		//Implemented an an array
		Flight[] goFirstFlights= this.goFirst.getGoFirstFlights();
		System.out.println("GoFirst flights(without iterator)");
		for(Flight goFirstFlight:goFirstFlights){
			System.out.println("Source:"+goFirstFlight.getSource()+" Destination:"+goFirstFlight.getDestination()+" Duration:"+goFirstFlight.getDuration()+" Status:"+goFirstFlight.getStatus());
		}
	}//getAllFlights
}
