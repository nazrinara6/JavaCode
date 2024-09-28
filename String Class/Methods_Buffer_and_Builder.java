package string_class_package;

public class Methods_Buffer_and_Builder {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Automation");
		//length
		System.out.println(s1.length());
	    //append
		System.out.println(s1.append(" Testing"));
		//replace
		System.out.println(s1.replace(0, 10, "API"));
		//delete
		System.out.println(s1.delete(0, 4));
		System.out.println(s1.charAt(2));
		System.out.println(s1.capacity());
	}

}

