package oop_package;
class Access
{
	void hello()
	{
		System.out.println("Method2");
	}
}

public class Polymorphism_Concept extends Access
{
    
	void hello()
	{
		System.out.println("Method1");
	}
	public static void main(String[] args) 
	{
		 Access a1 = new Access();
		 a1.hello();
    }

}

