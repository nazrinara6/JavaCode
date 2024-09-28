package oop_package;

public class IIB_concept {

	{
		System.out.println("IIB 1");
	}
	static
	{
		System.out.println("SIB 1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		IIB_concept a1 = new IIB_concept();
	}	
	public IIB_concept()
	{
		System.out.println("Constructor");
	}

}

