package model.Terrestrial;
import model.Universe.Being;
import controller.BasicHumanActions;
import controller.VirtuousHumanAction;

public abstract class Person extends Being implements BasicHumanActions, VirtuousHumanAction {
	
	public int numberOfHearts = 1;

}
