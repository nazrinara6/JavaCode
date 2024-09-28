package core_java_assignment;

import java.util.Arrays;

public class Assign_27_Reverse_Array {

    public static void main(String[] args) {
    	int array_1[] = new int[5];
		int array_2[] = new int[5];
		
		array_1[0] = 2;
		array_1[1] = 4;
		array_1[2] = 6;
		array_1[3] = 8;
		array_1[4] = 10;
		
		for(int i=0,k=4;i<array_1.length;i++)
		{ 
			array_2[k]=array_1[i];
			k--;
			
		}
		System.out.println(Arrays.toString(array_1));
		System.out.println(Arrays.toString(array_2));
	}

}
