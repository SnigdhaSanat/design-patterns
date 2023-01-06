package AdapterPattern.Adaptee;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
	public Amazon(){};

	List<AmazonItem> catalog=new ArrayList<AmazonItem>();

	public void addItemsToCatalog(){
		System.out.println("Adding items to catalog in Amazon.....");
		catalog.add(new AmazonItem("itemId1", "model1", 3000));
		catalog.add(new AmazonItem("itemId2", "model2", 4000));
	}

	public void displayItems(){
		System.out.println("Showing items in Amazon.....");
		for(int i=0;i<catalog.size();i++){
			System.out.println("ItemId:"+catalog.get(i).getItemId()+" Model:"+catalog.get(i).getModel()+" Price:"+catalog.get(i).getPrice());
		}
	}

	public void purchase(){
		System.out.println("Buying in Amazon.....");
	}
}
