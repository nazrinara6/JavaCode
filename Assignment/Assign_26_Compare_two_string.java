package core_java_assignment;

import java.util.Arrays;

public class Assign_26_Compare_two_string {

	public static void main(String[] args) {
		//compare two arrays of String datatype
		{
			//char 1
			String name1[] = new String[5];
			name1[0]= "Nazrin";
			name1[1]= "World";
			name1[2]= "Hello";
			name1[3]= "Test";
			name1[4]= "Java";
			String name2[] = new String[5];
			name2[0]= "Nazrin";
			name2[1]= "World";
			name2[2]= "Java";
			name2[3]= "Hello";
			name2[4]= "Test";

			boolean a = Arrays.equals(name1, name2);
			System.out.println(a);
	}

}
}