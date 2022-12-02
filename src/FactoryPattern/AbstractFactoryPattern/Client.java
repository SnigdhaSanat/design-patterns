package FactoryPattern.AbstractFactoryPattern;

import FactoryPattern.AbstractFactoryPattern.Restaurant.KolkataBiryaniRestaurant;
import FactoryPattern.AbstractFactoryPattern.Restaurant.LucknowBiryaniRestaurant;
import FactoryPattern.AbstractFactoryPattern.Restaurant.BiryaniRestaurant;

public class Client {
	public static void main(String[] args) {
		BiryaniRestaurant kolkataBiryaniRestaurant=new KolkataBiryaniRestaurant();
		System.out.println("Ordering Veg biryani from Kolkata restaurant");
		//deliver method is inherited from BiryaniRestaurant
		kolkataBiryaniRestaurant.deliverBiryani(true);

		System.out.println("Ordering Chicken biryani from Kolkata restaurant");
		//deliver method is inherited from BiryaniRestaurant
		kolkataBiryaniRestaurant.deliverBiryani(false);

		BiryaniRestaurant lucknowBiryaniRestaurant=new LucknowBiryaniRestaurant();
		//deliver method is inherited from BiryaniRestaurant
		System.out.println("Ordering Veg biryani from Lucknow restaurant");
		lucknowBiryaniRestaurant.deliverBiryani(true);

		System.out.println("Ordering Chicken biryani from Lucknow restaurant");
		//deliver method is inherited from BiryaniRestaurant
		lucknowBiryaniRestaurant.deliverBiryani(false);

	}
}
