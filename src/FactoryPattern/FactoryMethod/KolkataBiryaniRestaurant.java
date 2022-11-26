package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.Product.Biryani;
import FactoryPattern.FactoryMethod.Product.KolkataChickenBiryani;
import FactoryPattern.FactoryMethod.Product.KolkataVegBiryani;

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

