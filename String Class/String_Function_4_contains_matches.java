package string_class_package;

public class String_Function_4_contains_matches {

	public static void main(String[] args) {
		//contains
		String s1 = "Manish Tiwari";
		boolean s2 = s1.contains("Tiwari");  //check if the string s1 contains Tiwari or not
		System.out.println(s2);
		
		boolean s3 = s1.contains("Kumar");   // false
		System.out.println(s3);
		
		//matches
		//1 - ends with l
		String a1 = "school";
		boolean a2 = a1.matches("(.*)l");
		System.out.println(a2);
		
		//2 - starts with l/m
		String a3 = "manish";
		boolean a4 = a3.matches("l(.*)");
		System.out.println(a4);
		boolean a5 = a3.matches("m(.*)");
		System.out.println(a5);
		
		//3 - the string has a or not
		String a6 = "nazrin";
		boolean a7 = a6.matches("(.*)a(.*)");
		System.out.println(a7);
		
		//4 - the given string has 4 letters or not
		String a8 = "word";
		boolean a9 = a8.matches("....");
		System.out.println(a9);
		

	}

}
