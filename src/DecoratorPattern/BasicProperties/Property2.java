package DecoratorPattern.BasicProperties;

public class Property2 extends Property {
	public Property2(){
		System.out.println("Initializing Property2");
		this.rent =7000;
	}

	@Override
	public int getRent() {
		System.out.println("Returning rent of Property2: 7000");
		return this.rent;
	}

}
