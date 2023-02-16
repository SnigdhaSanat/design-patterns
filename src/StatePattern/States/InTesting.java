package StatePattern.States;

import StatePattern.Project;


public class InTesting implements WorkItemStates {

	Project project;
	double testingResult;

	public InTesting(Project project){
		this.project=project;
		//This is a random simulation to generate the result of testing
		this.testingResult=Math.random()*100;
	}

	@Override
	public void startDev() {
		System.out.println("The work item is already in testing. You cannot re-start dev at this stage.");
	}

	@Override
	public void submitToQA() {
		System.out.println("The work item is already in testing. You cannot re-submit to QA.");
	}


	@Override
	public void test(){
		System.out.println("Testing...");
		//if testing passes, set the state to closed
		if((int)this.testingResult<50){
			System.out.println("Testing passed");
			project.setState(project.getClosed());
		}
		//else assign it back to the developer, and set the state back to InDevelopment
		else{
			System.out.println("Testing failed");
			project.setState(project.getInDevelopment());
		}
	}

	@Override
	public String toString() {
		return "InTesting";
	}
}
