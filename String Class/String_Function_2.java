package string_class_package;

public class String_Function_2 {

	public static void main(String[] args) {
		//equals
		String a1 = "Manish";
		String a2 = "Tiwari";
		boolean a3 = a1.equals(a2);
		System.out.println(a3);
		
		String a4 = "Manish";
		String a5 = "manish";   
		boolean a6 = a4.equals(a5);  // equals is case sensitive
		boolean a10 = a4.equalsIgnoreCase(a5); // equalsignorecase ignores the case sensitive letters
		System.out.println(a6);
		System.out.println(a10);
		
		String a7 = "Manish";
		String a8 = "Manish";
		boolean a9 = a7.equals(a8);
		System.out.println(a9); 
		
		//concat
		
		String s1 = "Nazrin";
		String s2 = s1.concat("Ara");  // concat combine the string
		System.out.println(s2);
		
		String s3 = s1.concat(" ").concat("Ara");
		System.out.println(s3);
		
		String s4 = s1.concat(s3).concat(" Khanam");
		System.out.println(s4);




	}

}

