package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.Product.LucknowiChickenBiryani;
import FactoryPattern.FactoryMethod.Product.LucknowiVegBiryani;
import FactoryPattern.FactoryMethod.Product.Biryani;

public class LucknowBiryaniRestaurant extends NewBiryaniRestaurant{
	@Override
	public Biryani cook(boolean veg) {
		if(veg){
			return new LucknowiVegBiryani();
		}
		else{
			return new LucknowiChickenBiryani();
		}
	}
}
