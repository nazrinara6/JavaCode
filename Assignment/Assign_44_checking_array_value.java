package core_java_assignment;
import java.util.Arrays;

public class Assign_44_checking_array_value {

	public static void main(String[] args) {
		
		int numbers[] = new int[4];
		numbers[0] =22;
		numbers[1] =34;
		numbers[2] =42;
		numbers[3] =52;
		
		int notocheck = 34;
		System.out.println(Arrays.toString(numbers));
		for(int i =0; i<4; i++)
		{
			if(notocheck == numbers[i])
			{
				System.out.println("The number " +notocheck +" is present in the Array and it's index is " +i);
			}
		}
		

	}

}

