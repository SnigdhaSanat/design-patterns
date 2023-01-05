package CommandPattern;

import CommandPattern.Commands.*;
import CommandPattern.Invokers.App;
import CommandPattern.Receivers.*;

public class Client {
	public static void main(String[] args) {
		CleaningCommand cleaningCommand=new CleaningCommand(new CleaningExpert());
		ElectricianCommand electricianCommand=new ElectricianCommand(new Electrician());
		PaintingCommand paintingCommand=new PaintingCommand(new Painter());
		PlumberCommand plumberCommand=new PlumberCommand(new Plumber());
		SalonCommand salonCommand=new SalonCommand(new SalonExpert());

		App app=new App();

		app.setTasks(0,cleaningCommand);
		app.setTasks(1,electricianCommand);
		app.setTasks(2,paintingCommand);
		app.setTasks(3,plumberCommand);
		app.setTasks(4,salonCommand);

		app.callExecute(0);
		app.callExecute(1);
		app.callExecute(2);
		app.callExecute(3);
		app.callExecute(4);
	}//main

}
