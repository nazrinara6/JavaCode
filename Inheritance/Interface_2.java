package inheritance_package;
interface Google1
{
	void login_auth();
	void logout_auth();
}
interface  Amazon1 extends Google1
{
	void login_auth_AMZ();
	void logout_auth_AMZ();
}
public class Interface_2 implements Amazon1
{

	public static void main(String[] args) {
		

	}

	public void login_auth() {
		
	}

	public void logout_auth() {
		
	}

	public void login_auth_AMZ() {
		
	}

	public void logout_auth_AMZ() {
		
	}

}
