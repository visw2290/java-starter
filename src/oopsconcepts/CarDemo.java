package oopsconcepts;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bk = new Bike("Duke","orange");
		String bike_make = bk.getMake();
		System.out.println(bike_make);
		bk.setColor("Yellow");
		System.out.println(bk.getColor());
		

	}

}
