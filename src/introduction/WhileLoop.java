package introduction;

public class WhileLoop {
	public static void main(String[] args) {
		
		//difference between while and do while is in do while 1 iteration is completed even if the condition fails
		int i = 1;
		int sum = 0;
		int j = 1;
		int sum1 = 0;
		
		while (i<1) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum of two numbers is " + sum);
		
		do {
			sum1 = sum1 + j;
			j++;
		}while(j < 1);
		System.out.println("The sum of two numbers is " + sum1);
		
	}

}
