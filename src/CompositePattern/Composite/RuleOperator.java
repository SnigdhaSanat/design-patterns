package CompositePattern.Composite;

import CompositePattern.Interface.Rule;
import java.util.ArrayList;

/*This is the rule operator, like AND, OR etc., which composes rules*/

public class RuleOperator implements Rule {
	String name;
	OperatorEnums.Operator op;
	ArrayList<Rule> children=new ArrayList<Rule>();

	public RuleOperator(String name, OperatorEnums.Operator op){
		this.name=name;
		this.op=op;
	}

	@Override
	public String getName() {
		//This is common for both RuleComposite and RuleElement
		return this.name;
	}

	@Override
	public String getRuleVersion() {
		//Version does not make sense for a rule operator
		return "";
	}

	@Override
	public void addRule(Rule rule) {
		/*Adds rule as a child  to the RuleOperator, so that the new rule child also contributes to the rule evaluation*/
		this.children.add(rule);
	}

	@Override
	public boolean evaluate() {
		/*This is recursive*/

		boolean result;

		if(this.op.equals(OperatorEnums.Operator.AND)){
			//case for AND operator
			result=true;
			for(int i=0;i<this.children.size();i++){
				//recurse with the children
				result=result&&children.get(i).evaluate();
			}
		}

		else{
			//case for OR operator
			result=false;
			for(int i=0;i<this.children.size();i++){
				//recurse with the children
				result=result||children.get(i).evaluate();
			}
		}

		System.out.println("Rule operator:"+this.op+" Result:"+result);
		return result;
	}

}//RuleOperator
