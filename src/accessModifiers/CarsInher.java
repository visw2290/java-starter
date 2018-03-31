package accessModifiers;

public class CarsInher {
	
	//default access specifier. available only within the package
	int speed;
	
	//available only within the class. Use getters and setters
	private int privateSpeed;
	
	//available anywhere in java world provided the class is imported
	public int publicSpeed;
	
	//available within the same package and in subclasses
	protected int protectedSpeed;
	
	public CarsInher(int startSpeed) {
		speed = startSpeed;
	}
	
	public void increaseSpeed() {
		speed++;
		System.out.println("Increasing speed of cars");
	}
	
	public void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of cars");
	}
	
	public int getspeed() {
		return speed;
	}
	public void getprivateSpeed(int sp) {
		privateSpeed = sp;
	}

}
