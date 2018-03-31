package introduction;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[] numbers = { 10, 20, 30 ,40};
		String[] cars = { "bmw","benz","maruthi"};
		//for(intialization, expression,updation)
		for(int i = 1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		for(int number:numbers) {
			System.out.println("The numbers in the array is " + number);
		}
		for(String car:cars) {
			System.out.println("The cars are " + car);
		}

	}

}
