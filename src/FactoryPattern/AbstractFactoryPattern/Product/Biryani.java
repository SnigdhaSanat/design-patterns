package FactoryPattern.AbstractFactoryPattern.Product;

import FactoryPattern.AbstractFactoryPattern.Ingredient.FruitsNVeggies;
import FactoryPattern.AbstractFactoryPattern.Ingredient.Meat;
import FactoryPattern.AbstractFactoryPattern.Ingredient.Rice;
import FactoryPattern.AbstractFactoryPattern.Ingredient.Spices;

public abstract class Biryani {
	Meat meat;
	Rice rice;
	Spices spices;
	FruitsNVeggies fruitsNVeggies;

	public Biryani(){
	}//Biryani ctor

	abstract public void prepare();


	public void reheat()
	{

	}
	public void deliver(){

	}
}
