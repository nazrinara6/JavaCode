package inheritance_package;     // this calling statement

public class Constructor_Overloading {
	Constructor_Overloading(String name) // It will be invoked and starts executing
	{
		System.out.println("Constructor with String");
	}
    Constructor_Overloading(int a) 
    {
        this("Nazrin");       // this() will invoke to the constructor with a parameter String
    	System.out.println("Constructor with integer");
	}
    Constructor_Overloading()      
    {
    	this(2);      // this() will chose whom to call by passing the value       
    	              // this() will invoke to the constructor with a parameter integer
    	System.out.println("Constructor with no para");
    }

	public static void main(String[] args) {
		Constructor_Overloading a1 = new Constructor_Overloading();
		                             
		                      //the object will invoke the constructor with no para

	}

}
