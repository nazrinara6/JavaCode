package exception_handling_package;

import java.util.InputMismatchException;

public class Throws_using_if_else {

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
