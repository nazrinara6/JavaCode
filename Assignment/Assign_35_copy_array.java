package core_java_assignment;
import java.util.Arrays;

public class Assign_35_copy_array 
{
    //copy the value of one array to another array using iteration
	public static void main(String[] args) 
    {
    	int student_id_1[] = new int[4];
    	int student_id_2[] = new int[4];
    	
		student_id_1[0] = 77;
		student_id_1[1] = 67;
		student_id_1[2] = 57;
		student_id_1[3] = 47;
		
		for(int i=0;i<student_id_1.length;i++)
		{
			student_id_2[i] = student_id_1[i];
			
		}
		System.out.println(Arrays.toString(student_id_2));
		

	}

}
