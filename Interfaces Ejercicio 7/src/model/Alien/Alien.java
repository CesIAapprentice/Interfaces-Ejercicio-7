package model.Alien;

import controller.AlienAction;
import controller.BasicHumanActions;
import model.Universe.Being;

public abstract class Alien extends Being implements AlienAction, BasicHumanActions{
	
	private boolean isMortal;

	public Alien(boolean isMortal) {
		this.isMortal = isMortal;
	}
	
	public void levitate() {
		
	}

}
