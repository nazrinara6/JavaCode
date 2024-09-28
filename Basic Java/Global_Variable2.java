package basics_of_java;

public class Global_Variable2 {

	String name = "Ramya";
	static double ram_salary = 985000.50;
	
	
	public static void main(String[] args) {
		int age = 38;
		System.out.println(ram_salary);
		System.out.println(age);
		Global_Variable2 a2 = new Global_Variable2();
		System.out.println(a2.name);
	}
	
}
