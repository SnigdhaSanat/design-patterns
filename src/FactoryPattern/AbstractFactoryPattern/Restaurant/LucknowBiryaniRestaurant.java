package FactoryPattern.AbstractFactoryPattern.Restaurant;

import FactoryPattern.AbstractFactoryPattern.IngredientFactory.BiryaniIngredientFactory;
import FactoryPattern.AbstractFactoryPattern.IngredientFactory.LucknowiBiryaniIngredientFactory;
import FactoryPattern.AbstractFactoryPattern.Product.Biryani;
import FactoryPattern.AbstractFactoryPattern.Product.ChickenBiryani;
import FactoryPattern.AbstractFactoryPattern.Product.VegBiryani;

public class LucknowBiryaniRestaurant extends BiryaniRestaurant{
	//This uses the LucknowiBiryaniIngredientFactory, and passes it to the Biryani classes
	@Override
	public Biryani cook(boolean veg) {
		Biryani biryani=null;

		BiryaniIngredientFactory lucknowiBiryaniIngredientFactory=new LucknowiBiryaniIngredientFactory();

		if(veg){
			biryani=new VegBiryani(lucknowiBiryaniIngredientFactory);
		}
		else{
			biryani=new ChickenBiryani(lucknowiBiryaniIngredientFactory);
		}
		return biryani;
	}
}
