package basics_of_java;

public class Arithmetic_Operators {
	
	static int a = 100; 
	static int b = 200; 
//without global variables we have to end up creating 10 local variables to solve this problem
	
	static void add() 
	{
		System.out.println(a+b);
	}
	static void sub() 
	{
		System.out.println(b-a);
	}
	static void mul() 
	{
		System.out.println(a*b);
	}
	static void div() 
	{
		System.out.println(b/a);
	}
	static void mod() 
	{
		System.out.println(b%a);
	}

	public static void main(String[] args) {
		add();
		sub() ;
		mul();
		div();
		mod();
	}

}
