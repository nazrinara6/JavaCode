package map_package;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_for_each_2 {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer,String>();
	    m1.put(213099, "Ataullah");
	    m1.put(132454, "Bhavani");
	    m1.put(675672, "Arpita");
	    m1.put(908123, "Danraj");
	    System.out.println(m1);
	    
	    for(Entry<Integer, String> s1 :  m1.entrySet())
	    {
	    	System.out.println(s1);
	    }
	    for(String s2 :  m1.values())
	    {
	    	System.out.println(s2);
	    }
	    for(Integer s3 :  m1.keySet())
	    {
	    	System.out.println(s3);
	    }
	    
	 }

}
