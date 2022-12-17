package CommandPattern.Commands;

import CommandPattern.Receivers.Painter;

public class PaintingCommand implements Command{

	Painter painter;
	public PaintingCommand(Painter painterParam){
		this.painter=painterParam;
	}

	@Override
	public void execute() {
	painter.paint();
	}
}
