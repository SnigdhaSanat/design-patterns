package TemplatePattern;

import TemplatePattern.ConcreteClasses.BoxingCenter;
import TemplatePattern.ConcreteClasses.WeightTrainingCenter;
import TemplatePattern.ConcreteClasses.YogaCenter;

public class Client {
	public static void main(String[] args) {
		YogaCenter yogaCenter=new YogaCenter();
		yogaCenter.train();

		WeightTrainingCenter weightTrainingCenter=new WeightTrainingCenter();
		weightTrainingCenter.train();

		BoxingCenter boxingCenter=new BoxingCenter();
		boxingCenter.train();
	}
}
