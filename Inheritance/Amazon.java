package inheritance_package;  // Method Overridding

class Google{
	void login()
	{
		System.out.println("Login with Mobile_Number");
	}
	
}
public class Amazon extends Google{
	
	void login()
	{
		super.login();
		System.out.println("Login with email_id");
		//super.login();   //super keyword can be write in any line
	}

	public static void main(String[] args) {
		Amazon a1 = new Amazon();
        a1.login();
	}

}
