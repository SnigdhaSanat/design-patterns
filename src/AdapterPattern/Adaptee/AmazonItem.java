package AdapterPattern.Adaptee;

public class AmazonItem {

	String itemId;
	String mdl;
	int price;

	public AmazonItem(String itemIdParam,String modelParam, int priceParam){
		this.itemId=itemIdParam;
		this.mdl=modelParam;
		this.price=priceParam;
	}

	public String getItemId() {
		return itemId;
	}

	public String getModel() {
		return mdl;
	}

	public int getPrice() {
		return price;
	}

}
