package CommandPattern.Commands;

import CommandPattern.Receivers.SalonExpert;

public class SalonCommand implements Command {

	SalonExpert salonExpert;
	public SalonCommand(SalonExpert salonExpertParam){
		this.salonExpert=salonExpertParam;
	}

	@Override
	public void execute() {
	salonExpert.salonService();
	}
}
