package core_java_assignment;  //Assignment 21b

// 3 classes in separate program

public class Login extends Testcase2 {  //class 3 inherits class 2
	static void makepayment() 
	{
		System.out.println("make payment for the products");
	}

	public static void main(String[] args) {
		search();
		add_to_wishlist();
		add_to_cart();
		makepayment();

	}

}
