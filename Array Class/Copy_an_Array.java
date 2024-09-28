package array_class_package;

import java.util.Arrays;

public class Copy_an_Array {

	public static void main(String[] args) {
		
		int rollno1[] = new int[4];
		rollno1[0] = 70;
		rollno1[1] = 71;
		rollno1[2] = 72;
		rollno1[3] = 73;
		
		int rollno2[] = new int[4];
		
		for(int i=0;i<4;i++)
		{
			rollno2[i] = rollno1[i];  //rollno2 copy the rollno1
		}
		System.out.println(Arrays.toString(rollno1));
		System.out.println(Arrays.toString(rollno2));

	}

}
