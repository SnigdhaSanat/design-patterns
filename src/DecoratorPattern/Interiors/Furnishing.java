package DecoratorPattern.Interiors;

import DecoratorPattern.BasicProperties.Property;

public class Furnishing extends Interior {
	//Furnishing wraps or decorates the Room
	Property property;

	public Furnishing(Property propertyParam){
		System.out.println("Initializing Furnishing");
		this.property = propertyParam;
		this.rent =6000;
	}

	@Override
	public int getRent() {
		int innerLayerRent=this.property.getRent();
		System.out.println("Returning rent of Furnishing :6000");
		return innerLayerRent+this.rent;
	}

}