package staticconcepts;

public class StaticKeywords {
	public int sum1 = 10;
	public static int sum2 = 10;

	//Static methods cannot access non static variables and methods directly without creating an instance
	//this and super cannot be used with static methods(this and super are associated with instance of a class
	//Hence this and super not used with static methods
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeywords s1 = new StaticKeywords();
		int output = s1.sum(40);
		int output1 = sumStatic(30);
		System.out.println(output);
		System.out.println(output1);

	}
	
	public int sum(int value) {
		return value + sum1;
	}
	
	public static int sumStatic(int value) {
		return value + sum2;
	}

}
