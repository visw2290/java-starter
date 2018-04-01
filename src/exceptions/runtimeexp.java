package exceptions;

public class runtimeexp {

	public static void main(String[] args) {
		 int a = 20;
		 int b = 0;
		 try {
			 int c = a/b;
			 System.out.println("The division value is " + c);
		 }
		 catch(ArithmeticException e) {
			 System.out.println(e.getMessage());
		 }
		 finally {
			 System.out.println("Program executed");
		 }

	}

}
