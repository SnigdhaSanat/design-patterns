package StatePattern;

import StatePattern.States.*;

public class Project {
	ToBeStarted toBeStarted;
	InDevelopment inDevelopment;
	InTesting inTesting;
	Closed closed;

	WorkItemStates currentState;

	public Project(){
		//initialize all the work item states
		toBeStarted =new ToBeStarted(this);
		inDevelopment=new InDevelopment(this);
		inTesting=new InTesting(this);
		closed=new Closed(this);

		//assign currentState as the default state
		this.currentState= toBeStarted;
		System.out.println("Current state:"+this.currentState);
	}//Project constructor

	//For each of the methods, call the corresponding method of the current state

	public void startDev(){
		currentState.startDev();
	}

	public void submitToQA(){
		currentState.submitToQA();
	}

	public void test(){
		currentState.test();
	}

	//Set the current state
	public void setState(WorkItemStates newState){
		System.out.println("Updated current state:"+newState);
		this.currentState=newState;
	}

	//Getter functions for all the states
	public ToBeStarted getToBeStarted(){
		return this.toBeStarted;
	}

	public InDevelopment getInDevelopment(){
		return this.inDevelopment;
	}

	public InTesting getInTesting(){
		return this.inTesting;
	}

	public Closed getClosed(){
		return this.closed;
	}
}//Project
