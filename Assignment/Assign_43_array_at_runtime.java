package core_java_assignment;

import java.util.Arrays;
import java.util.Scanner;
public class Assign_43_array_at_runtime 
{
	//Arrays at runtime
	public static void main(String[] args) 
	{
		int roll[] = new int[4];	
		Scanner s1 = new Scanner(System.in);
			
		for(int i=0;i<4;i++)
		{
			roll[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(roll));

	}

}


