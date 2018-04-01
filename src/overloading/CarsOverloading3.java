package overloading;

/***
 * method overloading by changing the sequesnce of arguments
 * @author Viswa
 *
 */

public class CarsOverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		machine(true, 10);
		machine(10, false);
		

	}
	public static void machine(boolean availability, int number) {
		System.out.println("The number of machines is "+ number + " and the availabity is " + availability);
	}
	public static void machine(int number, boolean availability) {
		System.out.println("The number of machines is " + number + " and the availabity is " + availability);
	}

}
