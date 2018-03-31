package oopsconcepts;

public class NewMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade;
		
		grade = methodNum1(95);
		display("Viswa",grade);
		grade = methodNum1(60);
		display("Shiva",grade);
		
	}
	//void if there is no return, String if return type String
	public static String methodNum1(int score)
	{
		String grade;
		if (score >=90 && score <=100) {
			grade = "A";
		}
		else if (score >=80 && score <= 89) {
			grade = "B";
		}
		else if(score >=70 && score <= 79) {
			grade = "C";
		}
		else {
			grade = "D";
		}
		return grade;
	}
	
	public static void display(String name, String grade) {
		System.out.println("The grade of " + name + " is " + grade);
	}

}
