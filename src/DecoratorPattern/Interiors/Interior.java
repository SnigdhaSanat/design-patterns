package DecoratorPattern.Interiors;

import DecoratorPattern.BasicProperties.Property;

public abstract class Interior extends Property {

	public Interior(){

	}

	public abstract int getRent();
	public void setRent(int rent){
		this.rent =0;
	}
}
