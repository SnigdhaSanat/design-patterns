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

	}

	@Override
	public void test() {

	}


	@Override
	public String toString() {
		return "ToBeStarted";
	}
}
