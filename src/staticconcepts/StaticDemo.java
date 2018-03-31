package staticconcepts;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExampleClass s1 = new StaticExampleClass("maruthi");
		System.out.println("The make of the car is " + s1.getMake());
		System.out.println("The total instances is " + s1.getInstanceNum());
		
		StaticExampleClass s2 = new StaticExampleClass("hyundai");
		System.out.println("The make of the car is " + s2.getMake());
		System.out.println("The total instances is " + s2.getInstanceNum());
		
		//to access static variables we can use classname.staticvariablename instead of accessing using objects
		System.out.println("The total instances in static is " + StaticExampleClass.instanceNum);
		

	}

}
