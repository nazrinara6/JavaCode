package inheritance_package;

abstract  class Facebook_auth
{
	abstract void fb_login();
	abstract void fb_registration();
}
abstract class Google_auth extends Facebook_auth
{
	abstract void google_login();
	abstract void google_registration();
}
public class Gortechminds_Abstract extends Google_auth
{
    void google_login() 
	{
			
	}
    void google_registration()
	{
		
	}
    void fb_login() 
	{
	
	}
    void fb_registration() 
	{
    	
	}

	public static void main(String[] args) 
	{


	}



}
