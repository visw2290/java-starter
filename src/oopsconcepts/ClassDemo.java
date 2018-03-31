package oopsconcepts;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car honda = new Car();
		honda.setMake("Honda");
		System.out.println(honda.getMake());
		
		Car benz = new Car();
		benz.setMake("Benz");
		System.out.println(benz.getMake());
		
		benz.setYear(1987);
		System.out.println(benz.getYear());
		
		Car maruthi = new Car("baleno",2017);
		System.out.println(maruthi.getModel());
		System.out.println(maruthi.getYear());

	}

}
