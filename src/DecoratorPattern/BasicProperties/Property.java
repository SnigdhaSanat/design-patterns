package DecoratorPattern.BasicProperties;

public abstract class Property {
	public int rent;

	 public Property(){
	 }

	public abstract int getRent() ;

	public void setRent(int rent)
	{
		this.rent = 0;
	}
}
