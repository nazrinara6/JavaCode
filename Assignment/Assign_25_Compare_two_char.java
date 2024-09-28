package core_java_assignment;

import java.util.Arrays;

public class Assign_25_Compare_two_char {

	public static void main(String[] args)
	//compare two arrays of char datatype
	{
		//char 1
		char grades[] = new char[5];
		grades[0]= 'a';
		grades[1]= 'd';
		grades[2]= 's';
		grades[3]= 'w';
		grades[4]= 'a';
		char grades2[] = new char[5];
		grades2[0]= 'a';
		grades2[1]= 'd';
		grades2[2]= 's';
		grades2[3]= 'w';
		grades2[4]= 'a';

		boolean a = Arrays.equals(grades, grades2);
		System.out.println(a);

	}

}
