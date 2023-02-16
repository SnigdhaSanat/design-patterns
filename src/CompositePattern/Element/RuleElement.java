package CompositePattern.Element;

import CompositePattern.Interface.Rule;

/*This is the atomic rule of the rule engine*/
public class RuleElement implements Rule {
	String name;
	String version;
	boolean ruleResult;

	public RuleElement(String name, String version, boolean ruleResult){
		this.name=name;
		this.version=version;
		this.ruleResult=ruleResult;
	}

	@Override
	public String getName() {
		//This is common for both RuleComposite and RuleElement
		return this.name;
	}

	@Override
	public String getRuleVersion() {
		//Get the version of the rule
		return this.version;
	}

	@Override
	public void addRule(Rule rule) {
		/*This does not make much sense for a RuleElement. You cannot add another rule to a rule element.*/
		return ;
	}

	@Override
	public boolean evaluate() {
		//Unlike rule operator, this is non-recursive
		System.out.println("Rule element:"+this.name+" Result:"+this.ruleResult);
		return this.ruleResult;
	}
}//RuleElement
