package overloading;

/***
 * method overloading by passing different number of parameters
 * @author Viswa
 *
 */

public class CarsOverloading1 {
	public static void main(String[] args) {
		machine(10);
		machine(10, true);
		
	}
	
	public static void machine(int number) {
		System.out.println("The number of machines is "+ number);
	}
	public static void machine(int number, boolean availability) {
		System.out.println("The number of machines available is " + number + " and the availabity is " + availability);
	}

}
