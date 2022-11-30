package FactoryPattern.AbstractFactoryPattern.IngredientFactory;

import FactoryPattern.AbstractFactoryPattern.Ingredient.FruitsNVeggies;
import FactoryPattern.AbstractFactoryPattern.Ingredient.Meat;
import FactoryPattern.AbstractFactoryPattern.Ingredient.Rice;
import FactoryPattern.AbstractFactoryPattern.Ingredient.Spices;

public abstract class BiryaniIngredientFactory {
	public abstract Meat addMeat();
	public abstract FruitsNVeggies addFruitsNVeggies();
	public abstract Rice addRice();
	public abstract Spices addSpices();
}//BiryaniIngredientFactory

