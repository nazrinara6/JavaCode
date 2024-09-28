package inheritance_package;                //single level inheritance
                                    //both classes are separate but in a single package

public class Student extends Teacher{          //sub class/ child class
	void add()                                 //non static method of child class
	{
		System.out.println("Addition");
	}
	static void sub()  //static method of child class
	{
		System.out.println("Substraction");
	}

	public static void main(String[] args) {
		
		Student a1 = new Student();         // always create an object in child class 
		                                    // for calling the non static method from parent class
	    selenium();
	    a1.sql();;
	    java();
	    a1.add();
	    sub();

	}

}
