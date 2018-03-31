package introduction;

public class Conditional {
	public static void main(String[] args) {
		int score = 88;
		String grade;
		
		if (score > 90) {
			grade = "A";
		}
		else if (score > 80 && score < 90) {
			grade = "B";
		}
		else {
			grade = "C";
		}
		
		System.out.println("The grade is " + grade);
	}

}
