package model.Alien;

import controller.AlienAction;
import model.Universe.Being;

public abstract class Alien extends Being implements AlienAction{
	
	private boolean isMortal;

	public Alien(boolean isMortal) {
		this.isMortal = isMortal;
	}

}
