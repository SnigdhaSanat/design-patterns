package AdapterPattern;

import AdapterPattern.Adaptee.Amazon;
import AdapterPattern.Adaptee.Flipkart;
import AdapterPattern.Adapter.AmazonAdapter;
import AdapterPattern.Adapter.FlipkartAdapter;
import AdapterPattern.Target.ShoppingAggregator;

public class Client {

	public static void main(String[] args) {
		//----------Pass off Flipkart as the ShoppingAggregator---------------
		ShoppingAggregator flipkartAdapter=new FlipkartAdapter(new Flipkart());
		flipkartAdapter.addItemsToCatalogInAggregator();
		flipkartAdapter.showItemsInAggregator();
		flipkartAdapter.buyInAggregator();

		//----------Pass off Amazon as the ShoppingAggregator---------------
		ShoppingAggregator amazonAdapter=new AmazonAdapter(new Amazon());
		amazonAdapter.addItemsToCatalogInAggregator();
		amazonAdapter.showItemsInAggregator();
		amazonAdapter.buyInAggregator();
	}//main

}
