package TemplatePattern.ConcreteClasses;

import TemplatePattern.TemplateClass.FitnessCenter;

public class BoxingCenter extends FitnessCenter {
	@Override
	public void physicalActivity() {
		System.out.println("Boxing in progress");
	}//physicalActivity
}
