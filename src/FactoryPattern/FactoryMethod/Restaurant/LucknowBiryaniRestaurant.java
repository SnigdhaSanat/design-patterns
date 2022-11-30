package FactoryPattern.FactoryMethod.Restaurant;

import FactoryPattern.FactoryMethod.Product.LucknowiChickenBiryani;
import FactoryPattern.FactoryMethod.Product.LucknowiVegBiryani;
import FactoryPattern.FactoryMethod.Product.Biryani;
import FactoryPattern.FactoryMethod.Restaurant.NewBiryaniRestaurant;

public class LucknowBiryaniRestaurant extends NewBiryaniRestaurant {
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

