package CommandPattern.Commands;

import CommandPattern.Receivers.CleaningExpert;

public class CleaningCommand implements Command {

	CleaningExpert cleaningExpert;
	public CleaningCommand(CleaningExpert cleaningExpertParam){
		this.cleaningExpert=cleaningExpertParam;
	}

	@Override
	public void execute() {
	cleaningExpert.cleaning();
	}
}
