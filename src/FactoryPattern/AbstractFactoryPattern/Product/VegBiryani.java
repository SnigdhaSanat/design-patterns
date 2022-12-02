package FactoryPattern.AbstractFactoryPattern.Product;

import FactoryPattern.AbstractFactoryPattern.IngredientFactory.BiryaniIngredientFactory;

public class VegBiryani extends Biryani {

	BiryaniIngredientFactory biryaniIngredientFactory;

	public VegBiryani(BiryaniIngredientFactory biryaniIngredientFactoryParam){
		this.biryaniIngredientFactory=biryaniIngredientFactoryParam;
	}//ctor

	@Override
	public void prepare() {
		//prepare through the Factory
		System.out.println("Skipping meat");
		biryaniIngredientFactory.addRice();
		biryaniIngredientFactory.addSpices();
		biryaniIngredientFactory.addFruitsNVeggies();

	}
}
