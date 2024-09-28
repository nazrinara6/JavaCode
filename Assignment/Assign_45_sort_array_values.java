package core_java_assignment;

import java.util.Arrays;

public class Assign_45_sort_array_values {
	
	//sort the value of the array

	public static void main(String[] args) {
		
		String s1= "manish";
		char c1[] = s1.toCharArray();   // convert string to char
		System.out.println(Arrays.toString(c1));   // convert into array form
		
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));

	}

}
