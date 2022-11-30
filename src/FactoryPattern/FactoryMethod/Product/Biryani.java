package FactoryPattern.FactoryMethod.Product;

public abstract class Biryani {
	String meat;
	String rice;
	String spices;
	String fruitsNVeggies;

	public Biryani(){
	}//Biryani ctor

	public void prepare(){
		System.out.println("Adding meat:"+meat);
		System.out.println("Adding rice:"+rice);
		System.out.println("Adding spices:"+spices);
		System.out.println("Adding fruits and veggies:"+ fruitsNVeggies);
	}

	public void reheat()
	{

	}
	public void deliver(){

	}
}
