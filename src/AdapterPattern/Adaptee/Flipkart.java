package AdapterPattern.Adaptee;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
	public Flipkart(){};

	List<FlipkartItem> catalog=new ArrayList<FlipkartItem>();

	public void addItemsToCatalog(){
		System.out.println("Adding items to catalog in Flipkart.....");
		catalog.add(new FlipkartItem("itemId1", "model1", 1000));
		catalog.add(new FlipkartItem("itemId2", "model2", 2000));
	}

	public void showItems(){
		System.out.println("Showing items in Flipkart.....");
		for(int i=0;i<catalog.size();i++){
			System.out.println("ItemId:"+catalog.get(i).getItemId()+" Model:"+catalog.get(i).getModel()+" Cost:"+catalog.get(i).getCost());
		}
	}

	public void buy(){
		System.out.println("Buying in Flipkart.....");
	}
}
