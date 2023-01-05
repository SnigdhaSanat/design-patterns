package CommandPattern.Invokers;


import CommandPattern.Commands.Command;

public class App {
	Command[] buttons;
	public App(){
		buttons=new Command[5];
	}

	
	public void setTasks(int buttonIndex, Command command){
		buttons[buttonIndex]=command;
	}

	public void callExecute(int buttonIndex){
		Command commandToExecute=buttons[buttonIndex];
		commandToExecute.execute();
	}

}
