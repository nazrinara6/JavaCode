package map_package;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_for_each_Loop {

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String,String>();
	    m1.put("GTM11", "Annu");
	    m1.put("GTM12", "Hamida");
	    m1.put("GTM13", "Upoma");
	    m1.put("GTM14", "Lipsi");
	    System.out.println(m1);
	    
		for(String s2 : m1.values())     //iterate the values
	    {
	    	System.out.println(s2);
	    }
	    
	    for(String s1 : m1.keySet())     //iterate the keys
	    {
	    	System.out.println(s1);
	    }
	    for(String s2 : m1.values())     //iterate the values
	    {
	    	System.out.println(s2);
	    }
	    for(Entry<String, String> s3 : m1.entrySet())     //iterate the values
	    {
	    	System.out.println(s3);
	    }

	}

}
