package string_class_package;

public class String_Function_1 {

	public static void main(String[] args) 
	{
		String name = "Nazrin";
		int size = name.length();
		System.out.println(size);
		System.out.println(name.substring(2, 5));
		System.out.println(name.toLowerCase()); // string will be in lower case
		System.out.println(name.toUpperCase()); // string will be in upper case
		
		String s1 ="I am Nazrin";  
		System.out.println(s1);    
		System.out.println(s1.trim());
		
		String s2 ="        I am Ara";
		System.out.println(s2);        
		System.out.println(s2.trim());  // it will trim the beginning spaces of the string
		
		String s3 ="        I am Khanam        ";
		System.out.println(s3);
		System.out.println(s3.trim());   
		                    // it will trim the beginning and ending spaces of the string
		
		String s4 = "Hello World";
		System.out.println(s4.substring(3));  // string will start from index 3
		System.out.println(s4.subSequence(2, 8));
		   // string will start from index 2 and end at 7 as ending index will be always 
		   // n-1 which is 8-1=7
	}

}

