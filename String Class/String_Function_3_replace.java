package string_class_package;

public class String_Function_3_replace {

	public static void main(String[] args) {
		//replace
		
		String r1 = "Manish";
		String r2 = r1.replace('h', 'z');  //replace the single character of a string
		System.out.println(r2);
		
		String r3 = "Manish Tiwari";
		String r4 = r3.replaceAll("Tiwari", "Kumar");  //replace string with a new string
		System.out.println(r4);                        // replaceAll - indicates the whole string

		
		String name1 = "kv no 2 bangalore";
		String n1 = name1.replaceAll("[a-z]", "");  //remove all the lower case letters
		//System.out.println(n1);
		System.out.println(n1.trim());
		
		String name2 = "50 cent";
		String n2 = name2.replaceAll("[0-9]", "");  //remove all the numeric values 
		//System.out.println(n2);
		System.out.println(n2.trim());
		
		String name3 = "Manish Tiwari";
		String n3 = name3.replaceAll("[A-Z]", "");  //remove all the upper case letters
		System.out.println(n3);
		
		String name4 = "My name is Nazrin";         //remove all the spaces
		String n4 = name4.replaceAll(" ", "");
		System.out.println(n4);

		
		
	}

}

