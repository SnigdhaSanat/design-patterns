package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.Product.Biryani;

public abstract class NewBiryaniRestaurant {

/*The kitchen method is removed. The function is shifted to this class itself,
* as an abstract method*/

	/*This is inherited by the franchises. */
	public Biryani deliverBiryani(boolean isVeg){
		Biryani biryani;
		biryani=cook(isVeg);

		System.out.println("Reheating biryani");
		System.out.println("Delivering biryani");
		return biryani;
	}

	abstract public Biryani cook(boolean veg);
}//NewBiryaniRestaurant





