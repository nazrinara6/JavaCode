package access_specifier_2_package;   //AS for methods without creating relation with sub class

import access_specifier_3_package.Class_4;

public class Class_3 {

	public static void main(String[] args) {
		
		Class_4.method1();
	//	Class_4.method2();  //protected method cannot be access outside of the package
	//	Class_2.method3();  //private method cannot be access outside of the package
	//	Class_2.method4();  //default/package method cannot be access outside of the package
                            //without creating relation; extends
	}                 

}
