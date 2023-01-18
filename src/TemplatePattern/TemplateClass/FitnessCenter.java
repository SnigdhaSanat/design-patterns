package TemplatePattern.TemplateClass;

public abstract class FitnessCenter {
	public final void train(){
		//declared final, because the sequence of activities stay fixed
		warmUp();
		physicalActivity();
		coolDown();
		getBonusPoint();
	}//train

	public void warmUp(){
		System.out.println("Warming up");
	}
	public abstract void physicalActivity();

	public void coolDown(){
		System.out.println("Cooling down");
	}

	public void getBonusPoint(){
		System.out.println("You got bonus points");
		System.out.println();
	}

}//FitnessCenter
