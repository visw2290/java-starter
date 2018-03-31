package introduction;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hey this is my baby steps in Java";
		String str1 = "Hey";
		String str2 = "Hey";
		String str3 = "";
		String str4 = "             hey man              ";
		
		// find the length of the string
		System.out.println(str.length());
		
		// find the character given the index number
		System.out.println(str.charAt(4));
		
		// Concatanate the given string
		System.out.println(str1.concat("Viswa"));
		
		// find if the string contains in the given string
		System.out.println(str.contains("bab"));
		
		// find if the given string starts with the given value
		System.out.println(str.startsWith("Hey"));
		
		// find if the string ends with given value
		System.out.println(str.endsWith("Java"));

		// find if the string is equal to another string
		System.out.println(str1.equals(str2));
		
		// find the index of a character in a string
		System.out.println(str.indexOf('b'));
		
		// find if the given string is empty
		System.out.println(str.isEmpty());
		System.out.println(str3.isEmpty());
		
		// Remove leading and trailing whitespaces
		System.out.println(str4.trim());
		
		
		// Replace a character in string to another character
		System.out.println(str1.replace('e', 'a'));
		
		// Get only the substring of a string using begin and end index
		System.out.println(str.substring(4,9));
		
		// Convert string values to char array Hello -- > [H,e,l,l,o]
		char [] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			System.out.println("Index " + i + " contains " + charArray[i]);
		}
		
		// Lowercase all the values in the string
		System.out.println(str.toLowerCase());
		
		// Uppercase all values in the string
		System.out.println(str.toUpperCase());	

	}

}
