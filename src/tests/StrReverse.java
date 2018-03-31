package tests;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "This is a test string";
		String[] str2 = str1.split(" ");
		for(int i = str2.length-1;i>=0;i--) {
			System.out.println(str2[i]);
		}

	}

}
