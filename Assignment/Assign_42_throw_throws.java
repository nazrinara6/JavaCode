package core_java_assignment;

import java.util.InputMismatchException;

public class Assign_42_throw_throws {

	public static void main(String[] args) throws NullPointerException, InputMismatchException
	{
		if(1==1)
		{
		    throw new NullPointerException("Sorry your cell is empty");
	    }
		else 
		{
			throw new InputMismatchException("Sorry check your input before entering");
		}
			

	}

}


