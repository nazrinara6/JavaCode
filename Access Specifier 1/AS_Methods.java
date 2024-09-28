package access_specifier_1_package;

public class AS_Methods {
	
	public static void m1()
	{
		System.out.println("M1");
	}
	protected static void m2()
	{
		System.out.println("M2");
	}
	private static void m3()
	{
		System.out.println("M3");
	}
	static void m4()
	{
		System.out.println("M4");
	}
    
	public static void main(String[] args) {
		m1();
		m2();
		m3();
		m4();
    }

}
