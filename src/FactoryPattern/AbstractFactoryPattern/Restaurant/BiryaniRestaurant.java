package FactoryPattern.AbstractFactoryPattern.Restaurant;

import FactoryPattern.AbstractFactoryPattern.Product.Biryani;

public abstract class BiryaniRestaurant {
	public Biryani deliverBiryani(boolean isVeg){
		Biryani biryani;
		biryani=cook(isVeg);

		System.out.println("Preparing biryani..");
		biryani.prepare();

		System.out.println("Reheating biryani");
		biryani.reheat();

		System.out.println("Delivering biryani");
		biryani.deliver();

		System.out.println();
		return biryani;
	}
	abstract public Biryani cook(boolean veg);
}
