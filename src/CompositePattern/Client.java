package CompositePattern;

import CompositePattern.Composite.OperatorEnums;
import CompositePattern.Composite.RuleOperator;
import CompositePattern.Element.RuleElement;

public class Client {
	public static void main(String[] args) {
		//Create the rule tree
		//Create rule elements and rule operators

		RuleElement r1=new RuleElement("Rule 1", "1.0.1", true);
		RuleElement r2=new RuleElement("Rule 2", "1.0.0", true);
		RuleElement r3=new RuleElement("Rule 3", "1.0.1", false);
		RuleOperator ruleOperator1=new RuleOperator("Rule operator 1", OperatorEnums.Operator.AND);

		//Add the children to ruleOperator1
		ruleOperator1.addRule(r1);
		ruleOperator1.addRule(r2);
		ruleOperator1.addRule(r3);

		RuleElement r4=new RuleElement("Rule 4", "2.1.0", true);
		RuleElement r5=new RuleElement("Rule 5", "1.0.1", true);
		RuleOperator ruleOperator2=new RuleOperator("Rule operator 2", OperatorEnums.Operator.AND);

		//Add the children to ruleOperator2
		ruleOperator2.addRule(r4);
		ruleOperator2.addRule(r5);

		RuleOperator ruleOperator3=new RuleOperator("Rule operator 3", OperatorEnums.Operator.OR);
		//Add the children to ruleOperator3
		ruleOperator3.addRule(ruleOperator1);
		ruleOperator3.addRule(ruleOperator2);

		boolean result=ruleOperator3.evaluate();
		System.out.println("Result:"+result);
	}//main
}//Client
