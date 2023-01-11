package FacadePattern.Components;

public class Decoration {
	public void showDecorationOptions(){
		System.out.println("Showing decoration options");
	}

	public void decorate(){
		System.out.println("Decorating");
	}

	public void takeDownDecorations(){
		System.out.println("Taking down decorations after the event");
	}
}
