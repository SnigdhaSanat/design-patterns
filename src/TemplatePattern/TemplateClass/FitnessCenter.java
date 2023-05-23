package TemplatePattern.TemplateClass;

public abstract class FitnessCenter {
	public final void train(){
		//declared final, because the sequence of activities stay fixed
		warmUp();
		physicalActivity();
		coolDown();
		getBonusPoint();
		System.out.println("------------");
	}//train

	public void warmUp(){
		System.out.println("Warming up");
	}

	public abstract void physicalActivity();

	public void coolDown(){
		System.out.println("Cooling down");
	}

	/**This is a hook. The subclasses can OPTIONALLY override it*/
	public void getBonusPoint(){
		System.out.println("getBonusPoint() method of base class FitnessCenter called");
	}

}//FitnessCenter
