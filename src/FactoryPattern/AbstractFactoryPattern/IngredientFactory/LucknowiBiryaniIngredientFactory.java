package FactoryPattern.AbstractFactoryPattern.IngredientFactory;

import FactoryPattern.AbstractFactoryPattern.Ingredient.*;

public class LucknowiBiryaniIngredientFactory extends BiryaniIngredientFactory {
	@Override
	public Meat addMeat() {
		System.out.println("Adding chicken");
		return new Chicken();
	}

	@Override
	public FruitsNVeggies addFruitsNVeggies() {
		System.out.println("Adding Coconut powder");
		return new CoconutPowder();
	}

	@Override
	public Rice addRice() {
		System.out.println("Adding rice");
		return new Rice();
	}

	@Override
	public Spices addSpices() {
		System.out.println("Adding lucknowi spices");
		return new LucknowiSpices();
	}
}
