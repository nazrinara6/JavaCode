package array_class_package;

public class Array_1 {

	public static void main(String[] args) {
		
		int student_id[] = new int[3];
		student_id[0]=11;
		student_id[1]=34;
		student_id[2]=23;
		
		String name[] = new String[3];
		name[0]= "Akhlak";
		name[1]= "Nazrin";
		name[2]= "Nizam";
		
		for(int i=0;i<3;i++)
		{
			System.out.println("The name of the student is "+name[i]+ " and id is "+student_id[i]);
	
		}

	}

}
