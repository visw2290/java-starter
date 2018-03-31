package introduction;

public class defaultDataTypes {
	/* this is global declaration for the variables.
	 * Once we declare globally, initialization is not mandatory
	 * We can just declare the variables and call them in methods
	 */
	
	static byte byteVar;
	static short shortVar;
	static int intVar;
	static long longVar;
	static float floatVar;
	static double doubleVar;
	static boolean boolVar;
	static char charVar;
	
	
	public static void main(String [] args)
	{
		/* The data types are as below
		 * byte(-128,127)
		 * short(-32768,32767)
		 * int(-2,147,483,648, 2,147,483,647)
		 * long(-2^63,2^63-1)
		 * float
		 * double
		 * boolean(true,false)
		 * char(0,65535)
		 */
		
		System.out.println(byteVar);
		System.out.println(shortVar);
		System.out.println(intVar);
		System.out.println(longVar);
		System.out.println(floatVar);
		System.out.println(doubleVar);
		System.out.println(boolVar);
		System.out.println(charVar);
				
	}
	
	public static void OneMethod()
	{
		System.out.println(byteVar);
	}

}
