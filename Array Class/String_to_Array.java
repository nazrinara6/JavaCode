package array_class_package;

import java.util.Arrays;

public class String_to_Array {

	public static void main(String[] args) {
		
		String s1= "manish";
		char c1[] = s1.toCharArray();   // convert string to char
		System.out.println(Arrays.toString(c1));   // convert into array form
		
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));

	}

}
