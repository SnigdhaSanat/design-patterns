package DecoratorPattern.Interiors;

import DecoratorPattern.BasicProperties.Property;

public class FalseCeiling extends Interior {
	//FalseCeiling wraps or decorates the Room
	Property property;

	public FalseCeiling(Property propertyParam){
		System.out.println("Initializing FalseCeiling");
		this.property = propertyParam;
		this.rent =5000;
	}

	@Override
	public int getRent() {
		int innerLayerRent=this.property.getRent();
		System.out.println("Returning rent of FalseCeiling :5000");
		return innerLayerRent+this.rent;
	}
}
