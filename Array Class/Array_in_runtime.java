package array_class_package;

import java.util.Arrays;
import java.util.Scanner;

public class Array_in_runtime {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		int roll[] = new int[4];
		
		for(int i=0;i<4;i++)
		{
			roll[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(roll));

	}

}
