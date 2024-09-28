package hierchial_level_inheritance;

public class TestCase1 extends Login_To_Amazon{    // sub class 1
	static void search()
	{
		System.out.println("Search the items");
	}
	public static void main(String[] args) {
		login_code();
		search();
	}

}
