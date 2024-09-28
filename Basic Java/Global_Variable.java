package basics_of_java;

public class Global_Variable {
	
	String name = "Khan";  //global variable
	boolean a = false;  //global variable
    
	void substract() 
	{
		int a =100;  //local variable
		System.out.println(a);
	}
	
	static void add()
	{
		int b = 90; //local variable
		System.out.println(b);
	}

	public static void main(String[] args) {
		int c = 90;
		Global_Variable a1 = new Global_Variable();
		add();
		a1.substract();
		System.out.println(a1.name);
		System.out.println(a1.a);
		System.out.println(c);
	}

}
