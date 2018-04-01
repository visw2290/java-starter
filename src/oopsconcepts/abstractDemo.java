package oopsconcepts;

public class abstractDemo extends abstractCars {

	@Override
	public void engineStart(boolean keyless) {
		System.out.println("Implemented keyless engine");
		
	}
	
	public void setpriSpeed(int prispeed) {
		super.setpriSpeed(10);
	}


}
