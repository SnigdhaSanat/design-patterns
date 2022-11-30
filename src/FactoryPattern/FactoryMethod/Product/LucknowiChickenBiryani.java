package FactoryPattern.FactoryMethod.Product;

public class LucknowiChickenBiryani extends Biryani {
	public LucknowiChickenBiryani(){
		System.out.println("Preparing Lucknowi chicken biryani");
		meat="chicken";
		rice="rice";
		spices="lucknowi spices";
		fruitsNVeggies="coconut";
	}
}
