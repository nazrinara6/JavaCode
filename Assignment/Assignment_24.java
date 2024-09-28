package core_java_assignment;

public class Assignment_24 {

	public static void main(String[] args) {
		//double
		double marks[] = new double[5];
		marks[0]= 56.5;
		marks[1]= 34.2;
		marks[2]= 60.0;
		marks[3]= 29.9;
		marks[4]= 95.0;
		//boolean
		boolean status[] = new boolean[5];
		status[0] = true;
		status[1] = false;
		status[2] = true;
		status[3] = false;
		status[4] = true;

        for(int i =0; i<5; i++)
        {
       
        	if(marks[i]>=40)
        	{
        		if(status[i]==true)
        		{
      
        		         System.out.println("Student mark = " +marks[i] +", and status = "+status[i]  );
        		    }
        		}
        	else 
    		{
				System.out.println("Student mark = " +marks[i]+", and status = "+status[i] + ", so Failed");
			}
        	
        }
		
	}

}
