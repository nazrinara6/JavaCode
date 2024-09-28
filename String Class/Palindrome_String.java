package string_class_package;

public class Palindrome_String {

	public static void main(String[] args) {
		String input = "radar";  // rhs=lhs, lhs=rhs /madam/radar
		System.out.println("The input is = "+input);
		String output = "";
		
		for(int i =input.length()-1;i>=0;i--)
		{
			char c1 = input.charAt(i);
			output=output+c1;
		}
		System.out.println("The output is = "+output);
		
		if(input.equals(output))
		{
			System.out.println("It is a Palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}

	}

}

