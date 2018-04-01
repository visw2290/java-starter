package oopsconcepts;

public abstract class abstractCars {
	
	int speed;
	public int pubSpeed;
	private int priSpeed;
	
	public abstractCars() {
		
	}
	
	public abstractCars(int speed) {
		this.speed = speed;
	}
	
	public void setpriSpeed(int pspeed) {
		this.priSpeed = pspeed;
	}
	
	public abstract void engineStart(boolean keyless);

}
