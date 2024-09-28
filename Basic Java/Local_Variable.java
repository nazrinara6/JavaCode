package basics_of_java;

public class Local_Variable {
	
	static void add() 
	{
		int a = 100;  //local variable
		System.out.println(a);
	}
	void sub() 
	{
		String b = "Result will be b"; //local variable
		System.out.println(b);
	}
	static void input(int a,double b)
	{
		double c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		boolean c = true;  //local variable
		System.out.println(c);
		add();
		Local_Variable a1 = new Local_Variable();
		a1.sub();
		input(10,2.2);

	}

}
