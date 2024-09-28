package hierchial_level_inheritance;

public class TestCase2 extends Login_To_Amazon{    // sub class 2
	static void wish_list()
	{
		System.out.println("Your wishlist");
	}
	
	public static void main(String[] args) {
		login_code();
		wish_list();
	}
}
