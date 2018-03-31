package introduction;

public class StringDemo {
	
	public static void main(String[] args)
	{
		/*Two ways to initialize a string
		 * String is reference data type
		 * Initialize String as a literal
		 * Initialize string as an object
		 * String literal is stored in string constant pool.
		 */
		
		// Initializing string as a string literal. This helps in memory management
		// "Viswa" is an object and str1 is reference to the object. str1 is reference we are using to access "Viswa"
		// If there are two reference pointing to same object, string constant pool does not create a new obj in memory
		String str1 = "Viswa";
		System.out.println(str1);
		
		// Initializing string as an object. Not so good memory wise
		// Welcome is an object and str2 is the reference
		// If there are two reference pointing to same object, string constant pool creates a new obj in memory
		String str2 = new String("Shiva");
		System.out.println(str2);
		
		
	}

}
