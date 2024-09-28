package access_specifier_1_package;

public class AS_Methods_within_Package_2 {

	public static void main(String[] args) {
		AS_Methods_within_Package_1.n1();
		AS_Methods_within_Package_1.n2();
	//  AS_Methods_within_Package_1.n3();  //n3 is private so it cannot be call //not visible
		AS_Methods_within_Package_1.n4();

	}

}
