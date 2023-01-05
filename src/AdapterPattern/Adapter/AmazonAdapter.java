package AdapterPattern.Adapter;

import AdapterPattern.Adaptee.Amazon;
import AdapterPattern.Target.ShoppingAggregator;

public class AmazonAdapter implements ShoppingAggregator {
	//Pass off Amazon as the ShoppingAggregator
	Amazon amazon;

	public AmazonAdapter(Amazon amazonParam){
		this.amazon=amazonParam;
	}

	@Override
	public void addItemsToCatalogInAggregator() {
		amazon.addItemsToCatalog();
	}

	@Override
	public void showItemsInAggregator() {
		amazon.displayItems();
	}

	@Override
	public void buyInAggregator() {
		amazon.purchase();
	}
}
