package introduction;
import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Method 1 -> Declare an array , declare size of array, initialize values of the array
		int[] intArray1;
		intArray1 = new int[2];
		intArray1[0] = 100;
		intArray1[1] = 80;
		
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		//System.out.println(intArray1[2]);
		
		//Method 2 -> Declare, intialize the array in same line using {}.
		String[] stringArray1 = {"viswa","shiva"};
		
		System.out.println(stringArray1[0]);
		System.out.println(stringArray1[1]);
		
		int intLength = intArray1.length;
		int stringLength = stringArray1.length;
		
		for(int i = 0; i<intLength ; i++)
		{
			System.out.println(intArray1[i]);
		}
		
		Arrays.sort(intArray1);
		
		
		for(int i = 0; i<intLength ; i++)
		{
			System.out.println(intArray1[i]);
		}	
	}

}
