package FactoryPattern.FactoryMethod.Product;

public class KolkataChickenBiryani extends Biryani {
	public KolkataChickenBiryani(){
		System.out.println("Preparing Kolkata chicken biryani");
		meat="chicken";
		rice="rice";
		spices="kolkata spices";
		fruitsNVeggies="potato";
	}

}
