package core_java_assignment;

public class Assign_32_reverse_string {

	public static void main(String[] args) 
	{   //program to reverse a string
		
		String input = "school";
		System.out.println("My input is - "+input);
		String output ="";
		
		for(int i =input.length()-1;i>=0;i--)
		{
			char a = input.charAt(i);
			output=output+a;
		}
		System.out.println("My output is - "+output);
	

	}

}
