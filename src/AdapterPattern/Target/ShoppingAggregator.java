package AdapterPattern.Target;

import AdapterPattern.Adaptee.FlipkartItem;

import java.util.ArrayList;
import java.util.List;

public interface ShoppingAggregator {
	//List<ShoppingAggregatorItem> catalog=new ArrayList<ShoppingAggregatorItem>();

	public void addItemsToCatalogInAggregator();

	public void showItemsInAggregator();

	public void buyInAggregator();
}//ShoppingAggregator
