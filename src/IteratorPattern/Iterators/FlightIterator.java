package IteratorPattern.Iterators;

import IteratorPattern.Item.Flight;

public interface FlightIterator {
	Flight next();
	boolean hasNext();
}//FlightIterator
