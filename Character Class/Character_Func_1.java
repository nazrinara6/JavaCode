package character_class_package;

public class Character_Func_1 {

	public static void main(String[] args) {
		String a = "Nazrin11"; 
		char b[] = a.toCharArray();  //convert string into char
		System.out.println(b);
		
		boolean c = Character.isLetter(b[1]);   //if the given index is letter or not //true
		System.out.println(c);
		boolean d = Character.isLetter(b[6]);   //if the given index is letter or not //false
		System.out.println(d);

	}

}
