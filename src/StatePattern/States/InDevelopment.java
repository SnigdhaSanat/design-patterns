package StatePattern.States;

import StatePattern.Project;

public class InDevelopment implements WorkItemStates{

	Project project;

	public InDevelopment(Project project){
		this.project=project;
	}

	@Override
	public void startDev() {
	}

	@Override
	public void submitToQA() {
		System.out.println("Submitting to QA");
		project.setState(project.getInTesting());
	}

	@Override
	public void test() {

	}

	@Override
	public String toString() {
		return "InDevelopment";
	}
}
