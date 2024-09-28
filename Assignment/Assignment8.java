package core_java_assignment;

public class Assignment8 
{

	public static void main(String[] args) 
	{
		add(3,2);
		info("Nazrin", "07/02/1996");
		Assignment8 a1 = new Assignment8();
		a1.mod();
		a1.hello();

	}
	static void add(int a,int b) //parametrized static method1
	{
		int multi = a*b;
		System.out.println(multi);
	}
	static void info(String name,String dob) //parametrized static method2
	{
		System.out.println("My information");
	}
	void mod()  //non static method1
	{
		int a=12;
	    int b=10;
	    float mod = a%b;
	    System.out.println(mod);
	}
	void hello() //non static method2
	{
		System.out.println("2024");
	}

}
