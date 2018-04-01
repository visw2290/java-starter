package overloading;

/***
 * method overloading by passing different data types
 * @author Viswa
 *
 */

public class CarsOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		machine(15);
		machine("18");

	}
	public static void machine(int number) {
		System.out.println("The number of machines is "+ number);
	}
	public static void machine(String number) {
		System.out.println("The number of machines is " + number);
	}

}
