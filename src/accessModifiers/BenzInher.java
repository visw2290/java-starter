package accessModifiers;

public class BenzInher extends CarsInher{
	
	public BenzInher(int startSpeed) {
		super(startSpeed);
	}
	

	@Override
	public void increaseSpeed() {
		super.increaseSpeed();
	}
	
	public void ABS() {
		System.out.println("Implementing ABS");
	}
	
	

}
