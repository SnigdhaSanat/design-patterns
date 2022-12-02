package FactoryPattern.AbstractFactoryPattern.Product;

import FactoryPattern.AbstractFactoryPattern.IngredientFactory.BiryaniIngredientFactory;

public class ChickenBiryani extends Biryani{
	BiryaniIngredientFactory biryaniIngredientFactory;

	public ChickenBiryani(BiryaniIngredientFactory biryaniIngredientFactoryParam){
		this.biryaniIngredientFactory=biryaniIngredientFactoryParam;
	}//ctor

	@Override
	public void prepare() {
		//prepare through the Factory
		biryaniIngredientFactory.addMeat();
		biryaniIngredientFactory.addRice();
		biryaniIngredientFactory.addSpices();
		biryaniIngredientFactory.addFruitsNVeggies();

	}
}
