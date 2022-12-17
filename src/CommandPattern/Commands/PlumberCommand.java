package CommandPattern.Commands;

import CommandPattern.Receivers.Plumber;

public class PlumberCommand implements Command{

	Plumber plumber;
	public PlumberCommand(Plumber plumberParam){
		this.plumber=plumberParam;
	}

	@Override
	public void execute() {
	plumber.plumb();
	}
}
