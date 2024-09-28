package character_class_package;

public class Character_Func_2 {

	public static void main(String[] args) {
		 String a1 = "manish1";
		 char a2[] = a1.toCharArray();
		 
		 for(int i=0;i<a1.length();i++)
		 {
		     boolean a3 = Character.isLetter(a2[i]);
		     System.out.println(a3);
		 }

	}

}

