package CommandPattern.Commands;

import CommandPattern.Receivers.Electrician;

public class ElectricianCommand implements Command {

	Electrician electrician;
	public ElectricianCommand(Electrician electricianParam){
		this.electrician=electricianParam;
	}

	@Override
	public void execute() {
	electrician.fixElectrical();
	}
}
