package AdapterPattern.Adapter;

import AdapterPattern.Adaptee.Flipkart;
import AdapterPattern.Target.ShoppingAggregator;

public class FlipkartAdapter implements ShoppingAggregator {
//Pass off Flipkart as the ShoppingAggregator
	Flipkart flipkart;

	public FlipkartAdapter(Flipkart flipkartParam){
		this.flipkart=flipkartParam;
	}

	@Override
	public void addItemsToCatalogInAggregator() {
		flipkart.addItemsToCatalog();
	}

	@Override
	public void showItemsInAggregator() {
	flipkart.showItems();
	}

	@Override
	public void buyInAggregator() {
	flipkart.buy();
	}
}
