package TemplatePattern.ConcreteClasses;

import TemplatePattern.TemplateClass.FitnessCenter;

public class YogaCenter extends FitnessCenter {
	@Override
	public void physicalActivity() {
		System.out.println("Yoga in progress");
	}//physicalActivity

}//FitnessCenter

