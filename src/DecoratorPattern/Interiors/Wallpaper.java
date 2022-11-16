package DecoratorPattern.Interiors;

import DecoratorPattern.BasicProperties.Property;

public class Wallpaper extends Interior {
	//Wallpaper wraps or decorates the Room
	Property property;

	public Wallpaper(Property propertyParam){
		System.out.println("Initializing Wallpaper");
		this.property = propertyParam;
		this.rent =4000;
	}

	@Override
	public int getRent() {
		int innerLayerRent=this.property.getRent();
		System.out.println("Returning rent of Wallpaper :4000");
		return innerLayerRent+this.rent;
	}

}