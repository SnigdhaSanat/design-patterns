package FactoryPattern.FactoryMethod.Restaurant;

import FactoryPattern.FactoryMethod.Product.Biryani;
import FactoryPattern.FactoryMethod.Product.KolkataChickenBiryani;
import FactoryPattern.FactoryMethod.Product.KolkataVegBiryani;
import FactoryPattern.FactoryMethod.Restaurant.NewBiryaniRestaurant;

public class KolkataBiryaniRestaurant extends NewBiryaniRestaurant {
	@Override
	public Biryani cook(boolean veg) {
		if(veg){
			return new KolkataVegBiryani();
		}
		else{
			return new KolkataChickenBiryani();
		}
	}
}

