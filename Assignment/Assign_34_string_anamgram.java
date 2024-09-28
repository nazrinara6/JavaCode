package core_java_assignment;

import java.util.Arrays;

public class Assign_34_string_anamgram 
{   //program of a string is anagram or not

	public static void main(String[] args) {
		String name1 = "arm";  // a,m,r
		String name2 = "ram";  // a,m,r
		
		char c1[] = name1.toCharArray();  // convert the string into array
		char c2[] = name2.toCharArray();
		
		Arrays.sort(c1);    //sort the array
		Arrays.sort(c2);
		
		boolean b1 = Arrays.equals(c1, c2);   // check if both the arrays are equal or not
		System.out.println(b1);
		if(b1 == true)
		{
			System.out.println("They are Anagram");
		}
		else 
		{
			System.out.println("They are not Anagram");
		}
		
		

	}

}
