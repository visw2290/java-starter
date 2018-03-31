package tests;

public class StrRevSol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is a test string";
		String output = reverse(input);
		System.out.println("The reverse of the string is " + output);

	}
	
	public static String reverse(String input) {
		String reverse = "";
		String[] inputArr = input.split("\\s+");
		for(String rev:inputArr) {
			reverse = rev + " " + reverse;
		}
		return reverse;
	}

}
