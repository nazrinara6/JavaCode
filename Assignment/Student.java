package core_java_assignment;  //Assignment 21a

// Multi-level inheritance in a single class

class Teacher{     //super most class
	static void knowledge()
	{
		System.out.println("Teacher will provide knowledge to students");
	}
	static void writings()
	{
		System.out.println("Teacher will provide written notes to students");
	}
}
class Registration extends Teacher{   //super class
	static void reg()
	{
		System.out.println("register a student");
	}
	static void fees()
	{
		System.out.println("register will take payment from student");
	}
}
public class Student extends Registration{   //sub class
	static void books()
	{
		System.out.println("Students will have books");
	}
	static void pen()
	{
		System.out.println("Students will have pen");
	}

	public static void main(String[] args) {
		knowledge();
		writings();
		reg();
		fees();
		books();
		pen();

	}

}
