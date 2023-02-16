package StatePattern.States;

import StatePattern.Project;

public class InDevelopment implements WorkItemStates{

	Project project;

	public InDevelopment(Project project){
		this.project=project;
	}

	@Override
	public void startDev() {
		System.out.println("The work item is already in development. You cannot start development twice.");
	}

	@Override
	public void submitToQA() {
		System.out.println("Submitting to QA");
		project.setState(project.getInTesting());
	}

	@Override
	public void test() {
		System.out.println("You cannot test without submitting to QA first ");
	}

	@Override
	public String toString() {
		return "InDevelopment";
	}
}
