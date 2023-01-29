package IteratorPattern;

import IteratorPattern.Collection.GoFirst;
import IteratorPattern.Collection.Indigo;
import IteratorPattern.TravelSites.TravelSiteWithIterator;
import IteratorPattern.TravelSites.TravelSiteWithoutIterator;

public class Client {
	public static void main(String[] args) {
		Indigo indigo =new Indigo();
		GoFirst goFirst =new GoFirst();

		System.out.println("WITHOUT THE ITERATOR");
		TravelSiteWithoutIterator travelSiteWithoutIterator=new TravelSiteWithoutIterator(indigo, goFirst);
		travelSiteWithoutIterator.getAllFlights();

		System.out.println("----------------------------------");

		System.out.println("WITH THE ITERATOR");
		TravelSiteWithIterator travelSiteWithIterator=new TravelSiteWithIterator(indigo, goFirst);
		travelSiteWithIterator.getAllFlights();
	}
}
