package FactoryPattern.SimpleFactoryPattern.Kitchen;

import FactoryPattern.SimpleFactoryPattern.Product.Biryani;
import FactoryPattern.SimpleFactoryPattern.Product.ChickenBiryani;
import FactoryPattern.SimpleFactoryPattern.Product.VegBiryani;

public class SimpleBiryaniKitchen {

   //This is the factory effectively

	public Biryani cook(boolean veg){
		Biryani biryani=null;

		if(veg){
		biryani=new VegBiryani();
		}
		else  {
		biryani=new ChickenBiryani();
		}

		return biryani;
	}//cook

}//SimpleKitchen
