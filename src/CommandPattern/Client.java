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

		app.execute(0);
		app.execute(1);
		app.execute(2);
		app.execute(3);
		app.execute(4);
	}//main

}
