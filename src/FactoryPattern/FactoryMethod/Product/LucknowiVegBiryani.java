package FactoryPattern.FactoryMethod.Product;

public class LucknowiVegBiryani extends Biryani {
	public LucknowiVegBiryani(){
		System.out.println("Preparing Lucknowi veg biryani");
		meat=null;
		rice="rice";
		spices="lucknowi spices";
		fruitsNVeggies="coconut";
	}
}
