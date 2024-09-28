package inheritance_package;

class Class_2
{
	void auth()
	{
		System.out.println("login with Email id");
	}
}
/*
final class Class_3  // final class cannot be inherited
{
	void auth()
	{
		System.out.println("login with Email id");
	}
}
*/
public class Final_in_Class extends Class_2{

	void mobile_no()
	{
		System.out.println("login with mobile number");
	}

	public static void main(String[] args) {
		
		Final_in_Class f1 = new Final_in_Class();
		f1.mobile_no();
		f1.auth();
	}
}	