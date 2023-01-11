package FacadePattern;

import FacadePattern.Components.Catering;
import FacadePattern.Components.Decoration;
import FacadePattern.Components.Music;
import FacadePattern.Components.Photography;
import FacadePattern.Facade.EventPlannerFacade;

public class FacadeUtility {
	public static EventPlannerFacade getFacade(){
		EventPlannerFacade eventPlannerFacade=new EventPlannerFacade(new Catering(), new Music(), new Decoration(), new Photography());
		return eventPlannerFacade;
	}
}
