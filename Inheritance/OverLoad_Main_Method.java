package inheritance_package;   // main method overloading

public class OverLoad_Main_Method {
	
    public static void main() 
    {
		System.out.println("1");

	}
    public static void main(String a) 
    {
    	System.out.println("2");

    }
    public static void main(char b) 
    {
    	System.out.println("3");

    }

	public static void main(String[] args) {  // Heart
		main();
		main("Nazrin");
		main('a');

	}

}
