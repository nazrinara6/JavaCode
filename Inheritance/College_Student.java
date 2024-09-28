package inheritance_package;      //multi level inheritance
                          //in a single program, all three classes are present

class University{         //super most class
	static void fund()
	{
		System.out.println("Fund");
	}
}
class College extends University  //super class
{
	static void mislenious_expend()
	{
		System.out.println("Mislenioud expend");
	}
}

public class College_Student extends College{    //sub class
	static void tutionfee()
	{
		System.out.println("Tutuion fee");
	}

	public static void main(String[] args) {
		
		fund();
		mislenious_expend();
		tutionfee();
		
	}

}
