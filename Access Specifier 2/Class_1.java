package access_specifier_2_package;     //AS for methods by creating relation with sub class

import access_specifier_3_package.Class_2;

public class Class_1 extends Class_2{

	public static void main(String[] args) {
		
		Class_2.method1();
		Class_2.method2();
	//	Class_2.method3();  //private method cannot be access outside of the package
	//	Class_2.method4();  //default/package method cannot be access outside of the package
		

	}

}
