package core_java_assignment;

public class Assign_36_find_the_number_of_char 
{
    // find the number of letters,numeric,space,special character of a given string
	public static void main(String[] args) {
		
		int no_of_alphabets = 0;
		int no_of_numeric = 0;
		int no_of_spaces = 0;
		
		String myinfo = "Nazrin Ara 01730265071_% ";
		char b1[] = myinfo.toCharArray();
		System.out.println(b1);
		
		for(int i = 0; i<myinfo.length(); i++)
		{
			boolean a1 = Character.isLetter(b1[i]);    //counts the letter
			boolean a2 = Character.isDigit(b1[i]);     //counts the digits
			boolean a3 = Character.isWhitespace(b1[i]); //counts the spaces
			if(a1==true)
			{
				no_of_alphabets++;
			}
			if(a2==true)
			{
				no_of_numeric++;
			}
			if(a3==true)
			{
				no_of_spaces++;
			}
		}
		System.out.println("The number of alphabets = "+no_of_alphabets);
		System.out.println("The number of numeric = "+no_of_numeric);
		System.out.println("The number of spaces = "+no_of_spaces);
		int add = +no_of_alphabets + +no_of_numeric +no_of_spaces;
		int no_of_special_character = myinfo.length() - add;
		System.out.println("The number of spacial character = "+no_of_special_character);
	}

	

}
