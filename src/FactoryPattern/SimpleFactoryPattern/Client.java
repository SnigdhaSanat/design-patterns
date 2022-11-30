package FactoryPattern.SimpleFactoryPattern;

import FactoryPattern.SimpleFactoryPattern.Kitchen.SimpleBiryaniKitchen;
import FactoryPattern.SimpleFactoryPattern.Restaurant.SimpleBiryaniRestaurant;

public class Client {
	public static void main(String[] args) {

		SimpleBiryaniKitchen kitchen=new SimpleBiryaniKitchen();
		SimpleBiryaniRestaurant simpleBiryaniRestaurant=new SimpleBiryaniRestaurant(kitchen);

		System.out.println("Ordering veg biryani from client");
		simpleBiryaniRestaurant.deliverBiryani(true);

		System.out.println("Ordering chicken biryani from client");
		simpleBiryaniRestaurant.deliverBiryani(false);

	}
}
