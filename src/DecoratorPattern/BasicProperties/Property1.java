package DecoratorPattern.BasicProperties;

public class Property1 extends Property {
    public Property1(){
	    System.out.println("Initializing Property1");
	    this.rent =10000;
    }

	@Override
	public int getRent() {
		System.out.println("Returning rent of Property1 room: 10000");
		return this.rent;
	}

}
