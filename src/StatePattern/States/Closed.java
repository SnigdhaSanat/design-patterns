package StatePattern.States;

import StatePattern.Project;

public class Closed implements WorkItemStates {

	Project project;

	public Closed(Project project){
		this.project=project;
	}

	@Override
	public void startDev() {

	}

	@Override
	public void submitToQA() {

	}

	@Override
	public void test() {

	}


	@Override
	public String toString() {
		return "Closed";
	}
}
