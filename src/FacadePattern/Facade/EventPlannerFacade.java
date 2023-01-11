package FacadePattern.Facade;

import FacadePattern.Components.Catering;
import FacadePattern.Components.Decoration;
import FacadePattern.Components.Music;
import FacadePattern.Components.Photography;

public class EventPlannerFacade {
	Catering catering;
	Music music;
	Decoration decoration;
	Photography photography;

	public EventPlannerFacade(Catering cateringParam, Music musicParam, Decoration decorationParam, Photography photographyParam){
		catering=cateringParam;
		music=musicParam;
		decoration=decorationParam;
		photography=photographyParam;
	}//constructor

	public void prepareForEvent(){
		System.out.println("Preparing for event....");
		catering.giveMenuOptions();
		catering.cookFood();
		decoration.showDecorationOptions();
		decoration.decorate();
		System.out.println();
	}

	public void hostEvent(){
		System.out.println("Hosting event....");
		catering.serveFood();
		music.playMusic();
		music.turnUpVolume();
		music.changeSong();
		photography.takeStills();
		photography.takeVideo();
		System.out.println();
	}
	public void concludeEvent(){
		System.out.println("Concluding event....");
		music.turnDownVolume();
		music.stopMusic();
		decoration.takeDownDecorations();
		System.out.println();
	}
}
