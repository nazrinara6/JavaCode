package string_class_package;

public class String_Types {
	public static void main(String[] args) {
		//String
		String a1 = new String("Manish");
		System.out.println(a1);
		String a2 =a1.concat(" Tiwari");  //immutable
		System.out.println(a2);
		
		//StringBuilder //mutable
		StringBuilder s1 = new StringBuilder("Nazrin");
        s1.append(" Ara");
		System.out.println(s1);
		
		//StringBuilder //mutable
		StringBuffer s2 = new StringBuffer("Harjeet");
		s2.append(" Kalesh");
		System.out.println(s2);
		

	}

}

