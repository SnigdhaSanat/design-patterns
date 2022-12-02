package FactoryPattern.AbstractFactoryPattern.Restaurant;

import FactoryPattern.AbstractFactoryPattern.IngredientFactory.BiryaniIngredientFactory;
import FactoryPattern.AbstractFactoryPattern.IngredientFactory.KolkataBiryaniIngredientFactory;
import FactoryPattern.AbstractFactoryPattern.Product.Biryani;
import FactoryPattern.AbstractFactoryPattern.Product.ChickenBiryani;
import FactoryPattern.AbstractFactoryPattern.Product.VegBiryani;

public class KolkataBiryaniRestaurant extends BiryaniRestaurant {

	//This uses the KolkataBiryaniIngredientFactory, and passes it to the Biryani classes
	@Override
	public Biryani cook(boolean veg) {
		Biryani biryani=null;

		BiryaniIngredientFactory kolkataBiryaniIngredientFactory=new KolkataBiryaniIngredientFactory();

		if(veg){
			biryani=new VegBiryani(kolkataBiryaniIngredientFactory);
		}
		else{
			biryani=new ChickenBiryani(kolkataBiryaniIngredientFactory);
		}
		return biryani;
	}
}
