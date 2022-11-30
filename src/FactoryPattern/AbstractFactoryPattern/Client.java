package FactoryPattern.AbstractFactoryPattern;

import FactoryPattern.AbstractFactoryPattern.Restaurant.KolkataBiryaniRestaurant;
import FactoryPattern.AbstractFactoryPattern.Restaurant.LucknowBiryaniRestaurant;
import FactoryPattern.AbstractFactoryPattern.Restaurant.BiryaniRestaurant;

public class Client {
	public static void main(String[] args) {
		BiryaniRestaurant lucknowBiryaniRestaurant=new LucknowBiryaniRestaurant();
		System.out.println("Ordering Veg biryani from Lucknow restaurant");
		lucknowBiryaniRestaurant.deliverBiryani(true);

		System.out.println("Ordering Chicken biryani from Lucknow restaurant");
		lucknowBiryaniRestaurant.deliverBiryani(false);

		BiryaniRestaurant kolkataBiryaniRestaurant=new KolkataBiryaniRestaurant();
		System.out.println("Ordering Veg biryani from Kolkata restaurant");
		kolkataBiryaniRestaurant.deliverBiryani(true);

		System.out.println("Ordering Chicken biryani from Kolkata restaurant");
		kolkataBiryaniRestaurant.deliverBiryani(false);

	}
}
