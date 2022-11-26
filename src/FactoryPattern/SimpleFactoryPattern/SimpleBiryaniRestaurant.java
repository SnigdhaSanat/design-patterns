package FactoryPattern.SimpleFactoryPattern;

import FactoryPattern.SimpleFactoryPattern.Product.Biryani;

public class SimpleBiryaniRestaurant {

	//A restaurant has a (contains a) kitchen
	SimpleBiryaniKitchen simpleBiryaniKitchen;
	
	public SimpleBiryaniRestaurant(SimpleBiryaniKitchen simpleBiryaniKitchenParam){
		this.simpleBiryaniKitchen=simpleBiryaniKitchenParam;
	}

	public Biryani deliverBiryani(boolean isVeg){
		Biryani biryani;
		biryani=simpleBiryaniKitchen.cook(isVeg);

		System.out.println("Reheating biryani");
		System.out.println("Delivering biryani");
		return biryani;
	}

}
