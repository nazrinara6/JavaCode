package basics_of_java;

public class Global_Variable3 {
	
	int employee_id; 
    double salary;
    String name;
  // as global variables are not initilised so they will assign the default value   
  // if utilised
    
    void  employee_details(int employee_id,double salary,String name)
    {
    	System.out.println("Hello");
    }

	public static void main(String[] args) {
	    
	    Global_Variable3 a4 = new Global_Variable3();
	    a4.employee_details(11, 22000.0, "Nazrin"); //values are local variables
	    System.out.println(a4.salary);
	    System.out.println(a4.employee_id);
	    a4.employee_id = 100;  //updating the value
	    System.out.println(a4.employee_id);
	    
	}

}
