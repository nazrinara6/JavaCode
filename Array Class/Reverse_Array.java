package array_class_package;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		
		int array_1[] = new int[4];
		int array_2[] = new int[4];
		
		array_1[0] = 10;
		array_1[1] = 20;
		array_1[2] = 30;
		array_1[3] = 40;
		
		for(int i=0,k=3;i<array_1.length;i++)
		{ 
			array_2[k] = array_1[i];
			k--;
		}
		System.out.println(Arrays.toString(array_1));
		System.out.println(Arrays.toString(array_2));
		
    }

}
