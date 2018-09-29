package model.Terrestrial;
import model.Universe.Being;
import controller.Action;

public abstract class Animal extends Being {
	
	public boolean isPettable;
	
//------------------------------------------------
// CONSTRUCTOR		

	public Animal(boolean isPettable) {
		this.isPettable = isPettable;
	}
	
	

}
