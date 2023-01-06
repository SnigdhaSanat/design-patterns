package AdapterPattern.Target;

public interface ShoppingAggregator {
	//List<ShoppingAggregatorItem> catalog=new ArrayList<ShoppingAggregatorItem>();

	public void addItemsToCatalogInAggregator();

	public void showItemsInAggregator();

	public void buyInAggregator();
}//ShoppingAggregator
