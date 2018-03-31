package tests;

public class StrRevChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is a test string";
		String output = reverse(input);
		System.out.println("The reverse of the string is " + output);

	}
	
	public static String reverse(String input) {
		String reverse = "";
		char[] inputArr = input.toCharArray();
		for(char rev:inputArr) {
			reverse = rev + reverse;
		}
		return reverse;
	}

}
