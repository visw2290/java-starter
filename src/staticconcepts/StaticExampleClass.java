package staticconcepts;

public class StaticExampleClass {
	//We use static keyword when they are common properties for all instances. 
	//For ex, wheels is 4 for all cars. So we assign it as static variable instead of creating a object for each of them
	public String make;
	public static int instanceNum = 0;
	
	public StaticExampleClass(String make) {
		this.make = make;
		instanceNum++;
	}
	public String getMake() {
		return make;
	}
	public static int getInstanceNum() {
		return instanceNum;
	}

}
