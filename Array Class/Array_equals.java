package array_class_package;

import java.util.Arrays;

public class Array_equals {

	public static void main(String[] args) {
		
		int student_id_1[] = new int[4];
		student_id_1[0] = 77;
		student_id_1[1] = 67;
		student_id_1[2] = 57;
		student_id_1[3] = 47;
		
		int student_id_2[] = new int[4];
		student_id_2[0] = 77;
		student_id_2[1] = 67;
		student_id_2[2] = 57;
		student_id_2[3] = 47;
		
		boolean a = Arrays.equals(student_id_1, student_id_2);
		System.out.println(a);

	}

}

