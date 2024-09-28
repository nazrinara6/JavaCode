package core_java_assignment;

public class Assign_48_method_overloading {

        public void hello()                
		{
			System.out.println("Main 1");
		}
		public void hello(double b)      
		{
			System.out.println("Main 2");
		}
		public void hello(int c, String d) 
		{
			System.out.println("Main 3");
		}

		public static void main(String[] args) {
			
			Assign_48_method_overloading m1 = new Assign_48_method_overloading();
			m1.hello();
			m1.hello(2.2);
			m1.hello(5, "MKT");	

	}

}
