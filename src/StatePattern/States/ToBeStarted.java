package StatePattern.States;

import StatePattern.Project;

public class ToBeStarted implements WorkItemStates{

	Project project;

	public ToBeStarted(Project project){
	this.project=project;
	}

	@Override
	public void startDev() {
		System.out.println("Development started");
		project.setState(project.getInDevelopment());
	}

	@Override
	public void submitToQA() {
	System.out.println("You cannot submit to QA without starting the work item.");
	}

	@Override
	public void test() {
		System.out.println("You cannot test without starting the work item.");
	}


	@Override
	public String toString() {
		return "ToBeStarted";
	}
}
