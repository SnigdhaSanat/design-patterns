package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.Product.Biryani;

public class Client {
	public static void main(String[] args) {
		NewBiryaniRestaurant lucknowBiryaniRestaurant=new LucknowBiryaniRestaurant();
		System.out.println("Ordering veg biryani from Lucknow restaurant");
		lucknowBiryaniRestaurant.deliverBiryani(true);

		System.out.println("Ordering chicken biryani from Lucknow restaurant");
		lucknowBiryaniRestaurant.deliverBiryani(false);

		NewBiryaniRestaurant kolkataBiryaniRestaurant=new KolkataBiryaniRestaurant();
		System.out.println("Ordering veg biryani from Kolkata restaurant");
		kolkataBiryaniRestaurant.deliverBiryani(true);

		System.out.println("Ordering chicken biryani from Kolkata restaurant");
		kolkataBiryaniRestaurant.deliverBiryani(false);
	}//main


}//Client
