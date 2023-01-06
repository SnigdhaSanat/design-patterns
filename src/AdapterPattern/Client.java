package AdapterPattern;

import AdapterPattern.Adaptee.Amazon;
import AdapterPattern.Adaptee.Flipkart;
import AdapterPattern.Adapter.AmazonAdapter;
import AdapterPattern.Adapter.FlipkartAdapter;
import AdapterPattern.Target.ShoppingAggregator;

public class Client {

	public static void main(String[] args) {
		//----------Pass off Flipkart as the ShoppingAggregator---------------
		callShoppingAggregator(new FlipkartAdapter(new Flipkart()));

		System.out.println();

		//----------Pass off Amazon as the ShoppingAggregator-----------------
		callShoppingAggregator(new AmazonAdapter(new Amazon()));
	}//main

	  static void callShoppingAggregator(ShoppingAggregator shoppingAggregator){
		shoppingAggregator.addItemsToCatalogInAggregator();
		shoppingAggregator.showItemsInAggregator();
		shoppingAggregator.buyInAggregator();
	}//callShoppingAggregator
}//Client
