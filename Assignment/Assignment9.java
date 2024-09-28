package core_java_assignment;

public class Assignment9 {
	public static void main(String[] args) {
		login("nazrin", "112233rin");
		hello(12,5);
		web(2.0,3.2);
		Assignment9 a = new Assignment9(31);
		Assignment9 b = new Assignment9(1.2);
		Assignment9 c = new Assignment9(4.5f,5);
		a.naz(11, "Ara");
		a.code(3456000);
		a.city("Sylhet", 3100);
}
	// 3 parameterized static method
	static void login(String name, String password)
	{
	    System.out.println("Login successful");
	}
	static void hello(int a,int b)
	{
	    int c= a%b;
		System.out.println(c);
	}
	static void web(double b, double c)
	{
		double e = b*c;		
		System.out.println(e);
	}
	// 3 parameterized non static method
	void naz(int i,String s)
	{
		System.out.println("My name is Nazrin");
	}
	void code(long l)
	{
		System.out.println("Please run your code");
	}
	void city(String name, int citycode)
	{
		System.out.println("city code");
	}
	// 3 parameterized Constructor
	Assignment9(int a) 
	{
		System.out.println("Constructor 1");
	}
    Assignment9(double b) 
    {
    	System.out.println("Constructor 2");
	}
    Assignment9(float c,int d) 
    {
    	System.out.println("Constructor 3");
    }
}
