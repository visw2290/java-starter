package oopsconcepts;

public class Car {
	//Class is a blueprint to create a object
	//object(class),state(attributes),behavior(methods)
	
	private String color;
	
	private String make;
	
	private String model;
	
	private int year;
	
	//Constructors can be any in number. Constructors without arguments are there by default
	
	public Car() {
		this.model = "My Model";
		this.year = 2012;
		System.out.println("Exeuting constructors without arguments");
	}
	
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
		System.out.println("Executing constructors with arguments");
	}
	
	public void increaseSpeed() {
		System.out.println("Increasing Speed");
	}
	
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}


