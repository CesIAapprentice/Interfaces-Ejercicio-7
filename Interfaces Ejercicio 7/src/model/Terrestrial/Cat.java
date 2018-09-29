package model.Terrestrial;

public class Cat extends Animal {
	
	int numberOfLives;
	
//------------------------------------------------
// CONSTRUCTOR	

	public Cat(Integer numberOfLives, boolean isPettable) {
		super(isPettable);
		this.numberOfLives = numberOfLives;
	}
	
//------------------------------------------------
// METHODS
	
	@Override
	public void listen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
	
	}

}
