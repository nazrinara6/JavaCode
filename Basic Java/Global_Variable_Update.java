package basics_of_java;

public class Global_Variable_Update{
	
	String name = "Ramya";  //non static global variable
	static double ram_salary = 85000.50;  //static global variable
		
		
		public static void main(String[] args) {
			
			ram_salary = 100000.0;  //update static global variable
			int age = 38; //local variable
			System.out.println(ram_salary);
			System.out.println(age);
			Global_Variable2 a2 = new Global_Variable2();
			a2.name = "Ramy Verma";  //update non static global variable
			System.out.println(a2.name);
		}

	}
