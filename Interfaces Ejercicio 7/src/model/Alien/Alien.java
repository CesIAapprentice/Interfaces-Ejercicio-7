package model.Alien;

import controller.AlienAction;
import controller.BasicHumanActions;
import model.Universe.Being;

public abstract class Alien extends Being implements AlienAction, BasicHumanActions {
	
	private boolean isMortal;
	
//------------------------------------------------
// CONSTRUCTOR		

	public Alien(boolean isMortal) {
		this.isMortal = isMortal;
	}
	
//------------------------------------------------
// METHODS	
	
	public void levitate() {
		System.out.println("levitating");
		
	}

}
