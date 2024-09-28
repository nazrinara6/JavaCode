package inheritance_package;
class Method2
{
	final void auth()
	{
		System.out.println("login with Email id");
	}
}

public class Final_in_Methods extends Method2{
	
    /* 
    void auth() // we can't override a final method 
	{
	
	} 
	*/
	void mobile_no()
	{
		System.out.println("login with mobile number");
	}

	public static void main(String[] args) {
		
		Final_in_Methods f1 = new Final_in_Methods();
		f1.mobile_no();
		f1.auth();

	}

}
