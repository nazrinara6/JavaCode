package core_java_assignment;

public class Assign_49_Constructor_overloading {
	
	// program for constructor overloading

	    Assign_49_Constructor_overloading()                
		{
			System.out.println("Main 1");
		}
	    Assign_49_Constructor_overloading(double b)      
		{
			System.out.println("Main 2");
		}
	    Assign_49_Constructor_overloading(int c, String d) 
		{
			System.out.println("Main 3");
		}

		public static void main(String[] args) {
			
			Assign_49_Constructor_overloading m1 = new Assign_49_Constructor_overloading();
			Assign_49_Constructor_overloading m2 = new Assign_49_Constructor_overloading(23.4);
			Assign_49_Constructor_overloading m3 = new Assign_49_Constructor_overloading(45,"Naz");
			

	}

}
