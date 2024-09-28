package inheritance_package;          //single level inheritance
                              //in a single program, both classes are present

class Second{                 //super class/ parent class
	static void car() 
	{
		System.out.println("My father's car");
	}
	static void house() 
	{
		System.out.println("My father's house");
	}
	static void bike() 
	{
		System.out.println("My father's bike");
	}
}

public class First extends Second{         //sub class/ child class
	static void mobile() 
	{
		System.out.println("My mobile");
	}
	static void laptop() 
	{
		System.out.println("My laptop");
	}

	public static void main(String[] args) {
		car();
		house();
		bike();
		mobile();
		laptop();
		

	}

}
