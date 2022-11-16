package DecoratorPattern;

import DecoratorPattern.BasicProperties.Property2;
import DecoratorPattern.BasicProperties.Property1;
import DecoratorPattern.BasicProperties.Property;
import DecoratorPattern.Interiors.FalseCeiling;
import DecoratorPattern.Interiors.Furnishing;
import DecoratorPattern.Interiors.Wallpaper;

public class Reception {
	public static void main(String[] args) {

		int rent;
		Property property;

		System.out.println("--------------------------------");
		System.out.println("Price chart for reference:");
		System.out.println("Property1: "+"10000");
		System.out.println("Property2: "+"7000");
		System.out.println("False ceiling: "+"5000");
		System.out.println("Wallpaper: "+"4000");
		System.out.println("Furnishing: "+"6000");
		System.out.println("--------------------------------");
		System.out.println();

		System.out.println("Use case: Looking for a bare bones Property2");
		property =new Property2();
		rent= property.getRent();
		System.out.println("Final rent:"+rent);
		System.out.println("--------------------------------");
		System.out.println();

		System.out.println("Use case: Looking for Property2 with furnishing");
		property =new Property2();
		System.out.println("Decorating property2 with furnishing");
		property =new Furnishing(property);
		rent= property.getRent();
		System.out.println("Final rent:"+rent);
		System.out.println("--------------------------------");
		System.out.println();

		System.out.println("Use case: Looking for Property1 with false ceiling and wallpaper");
		property =new Property1();
		System.out.println("Decorating Property1 with false ceiling");
		property =new FalseCeiling(property);
		System.out.println("Decorating Property1 which now has false ceiling with wallpaper");
		property =new Wallpaper(property);
		rent= property.getRent();
		System.out.println("Final rent:"+rent);
		System.out.println("--------------------------------");
		System.out.println();

		System.out.println("Use case: Looking for Property1 will furnishing and wallpaper");
		property =new Property1();
		System.out.println("Decorating Property1 with furnishing");
		property =new Furnishing(property);
		System.out.println("Decorating Property1 which now has furnishing with wallpaper");
		property =new Wallpaper(property);
		rent= property.getRent();
		System.out.println("Final rent:"+rent);
		System.out.println("--------------------------------");
		System.out.println();
	}
}
