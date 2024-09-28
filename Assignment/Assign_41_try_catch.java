package core_java_assignment;

public class Assign_41_try_catch {

	public static void main(String[] args) {
		try 
		{
			int a = 1/0;
			System.out.println(a);
		}
		catch (ArithmeticException a1)  // if exception occcured, it will catch here
		{
			System.out.println("Handled the Exception");
		}
		finally 
		{
			System.out.println("Welcome to GTM");
		}

	}

}
