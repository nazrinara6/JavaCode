package core_java_assignment;  //overloading main methods where other main methods are non static 

public class Assignment_22 {
	
	public void main()                   // non static main method //non parameterized
	{
		System.out.println("Main 1");
	}
	public void main(double b)           // non static main method //parameterized
	{
		System.out.println("Main 2");
	}
	public void main(int c, String d)    // non static main method //parameterized
	{
		System.out.println("Main 3");
	}

	public static void main(String[] args) {
		
		Assignment_22 m1 = new Assignment_22();
		m1.main();
		m1.main(2.2);
		m1.main(5, "MKT");

	}

}
