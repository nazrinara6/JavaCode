package inheritance_package;        // super calling statement

class Grand_Parent
{
	Grand_Parent(int a,String b)   // Parameterized Constructor
	{
		System.out.println("1");   // It will start executing 
	}
}
class Parent_Class extends Grand_Parent
{
	Parent_Class()               // Non Parameterized Constructor
	{
		super(2,"Naz");          // This super() will invoke to the Grand_Parent class Constructor
		System.out.println("2");
	}
	
}

public class Child_Class extends Parent_Class{
     Child_Class(double c)       // Parameterized Constructor
     {
    	super();                 // This super() will invoke to the Parent_Class Constructor
 		System.out.println("3");
 	 }
		
	 public static void main(String[] args) 
	 {
		new Child_Class(2.2);     // This object will invoke to the Child_Class Constructor

	 }

}
