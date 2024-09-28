package hierchial_level_inheritance;

public class TestCase3 extends Login_To_Amazon{    // sub class 3
	static void cart()
	{
		System.out.println("Add to cart");
	}
	public static void main(String[] args) {
		login_code();
		cart();
	}

}
