package IteratorPattern;

import IteratorPattern.Collection.GoFirstFlights;
import IteratorPattern.Collection.IndigoFlights;
import IteratorPattern.TravelSites.TravelSiteWithIterator;
import IteratorPattern.TravelSites.TravelSiteWithoutIterator;

public class Client {
	public static void main(String[] args) {
		IndigoFlights indigoFlights=new IndigoFlights();
		GoFirstFlights goFirstFlights=new GoFirstFlights();

		System.out.println("WITHOUT THE ITERATOR");
		TravelSiteWithoutIterator travelSiteWithoutIterator=new TravelSiteWithoutIterator(indigoFlights,goFirstFlights);
		travelSiteWithoutIterator.getAllFlights();

		System.out.println("----------------------------------");

		System.out.println("WITH THE ITERATOR");
		TravelSiteWithIterator travelSiteWithIterator=new TravelSiteWithIterator(indigoFlights,goFirstFlights);
		travelSiteWithIterator.getAllFlights();
	}
}
