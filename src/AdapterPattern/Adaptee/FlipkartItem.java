package AdapterPattern.Adaptee;

public class FlipkartItem {
	String itemId;
	String model;
	int cost;
	public FlipkartItem(String itemIdParam,String modelParam, int costParam){
		this.itemId=itemIdParam;
		this.model=modelParam;
		this.cost=costParam;
	}

	public String getItemId() {
		return itemId;
	}

	public String getModel() {
		return model;
	}

	public int getCost() {
		return cost;
	}
}
