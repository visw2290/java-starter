package oopsconcepts;

public class Bike {
	
	static int wheels = 2;
	String Make;
	String Color;
	
	public Bike(String Make, String Color) {
		this.Make = Make;
		this.Color = Color;
	}
	
	public String getMake() {
		return this.Make;
	}
	public void setMake(String Make) {
		this.Make = Make;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		this.Color = color;
	}

}
