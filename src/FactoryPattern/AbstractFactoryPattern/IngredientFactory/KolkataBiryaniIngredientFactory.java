package FactoryPattern.AbstractFactoryPattern.IngredientFactory;

import FactoryPattern.AbstractFactoryPattern.Ingredient.*;

public class KolkataBiryaniIngredientFactory extends BiryaniIngredientFactory {
	public Meat addMeat() {
		System.out.println("Adding chicken");
		return new Chicken();
	}

	@Override
	public FruitsNVeggies addFruitsNVeggies() {
		System.out.println("Adding Potato");
		return new Potato();
	}

	@Override
	public Rice addRice() {
		System.out.println("Adding rice");
		return new Rice();
	}

	@Override
	public Spices addSpices() {
		System.out.println("Adding kolkata spices");
		return new KolkataSpices();
	}
}
