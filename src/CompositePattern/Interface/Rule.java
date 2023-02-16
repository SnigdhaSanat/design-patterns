package CompositePattern.Interface;

public interface Rule {
	public String getName();
	public String getRuleVersion();
	public void addRule(Rule rule);
	public boolean evaluate();
}
