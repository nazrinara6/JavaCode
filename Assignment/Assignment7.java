package core_java_assignment;

public class Assignment7 {

	public static void main(String[] args) {
	    int  age =22;
	    char g1 = 'm';
	    
	    if(g1 == 'm') 
	    {
	    	if(age <= 2) 
	    	{
	    		System.out.println("free ticket for infant");
	    	}
	    	else if(age > 2 && age <= 12)
	    	{
	    		System.out.println("half ticket for children");
	    	}

	    	else if(age > 12 && age <= 60)
	    	{
	    		System.out.println("full ticket for adults");
	    	}
	    	else
	    	{
	    		System.out.println("half ticket for senior citizen");
	    	}
	    }
	    else {
	    	System.out.println("free tickets for female");
		}
	    
		
		
	}
}
