package string_class_package;

public class Reverse_String {

	public static void main(String[] args) {
		
		String input = "aman";
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
