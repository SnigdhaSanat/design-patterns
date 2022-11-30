package FactoryPattern.FactoryMethod.Product;

public class KolkataVegBiryani extends Biryani{
	public KolkataVegBiryani(){
		System.out.println("Preparing Kolkata veg biryani");
		meat=null;
		rice="rice";
		spices="kolkata spices";
		fruitsNVeggies="potato";
	}
}
