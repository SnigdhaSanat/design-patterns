package TemplatePattern.ConcreteClasses;

import TemplatePattern.TemplateClass.FitnessCenter;

public class WeightTrainingCenter extends FitnessCenter {
	@Override
	public void physicalActivity() {
		System.out.println("Weight training in progress");
	}//physicalActivity

	@Override
	public void getBonusPoint() {
		//super.getBonusPoint();
		System.out.println("You got bonus points in weight training");
	}
}
