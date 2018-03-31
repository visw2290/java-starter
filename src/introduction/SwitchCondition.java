package introduction;

public class SwitchCondition {
	public static void main(String[] args) {
		int numDays = NumOfDays(2000,2);
		System.out.println("The number of days in the given month is " + numDays);
		
	}
	static int NumOfDays(int year, int month) {
		int numDays = 0;
		
		switch(month) {
		case 1:
			numDays =  31;
			break;
		case 2:
			if (year % 4 == 0) {
				numDays = 29;
				break;
			}
			else {
				numDays = 28;
				break;
			}
		case 3:
			numDays = 31;
			break;
		case 4:
			numDays = 30;
			break;
		case 5:
			numDays = 31;
			break;
		case 6:
			numDays = 30;
			break;
		case 7:
			numDays = 31;
			break;
		case 8:
			numDays = 31;
			break;
		case 9:
			numDays = 30;
			break;
		case 10:
			numDays = 31;
			break;
		case 11:
			numDays = 30;
			break;
		case 12:
			numDays = 31;
			break;
		default:
			System.out.println("Invalid month");
		}
		return numDays;
	}

}
