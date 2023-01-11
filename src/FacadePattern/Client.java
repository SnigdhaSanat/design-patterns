package FacadePattern;

import FacadePattern.Facade.EventPlannerFacade;

public class Client {
	public static void main(String[] args) {
		EventPlannerFacade eventPlannerFacade=FacadeUtility.getFacade();
		eventPlannerFacade.prepareForEvent();
		eventPlannerFacade.hostEvent();
		eventPlannerFacade.concludeEvent();
	}//main
}
