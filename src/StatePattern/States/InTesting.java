package StatePattern.States;

import StatePattern.Project;

import java.util.Random;

public class InTesting implements WorkItemStates {

	Project project;
	double testingResult;

	public InTesting(Project project){
		this.project=project;
		//This is a random stimulation to generate the result of testing
		this.testingResult=Math.random()*100;
	}

	@Override
	public void startDev() {

	}

	@Override
	public void submitToQA() {

	}


	@Override
	public void test(){
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
