package map_package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_iterator_2 {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<Integer,String>();
	    m1.put(213099, "Ataullah");
	    m1.put(132454, "Bhavani");
	    m1.put(675672, "Arpita");
	    m1.put(908123, "Danraj");
	    System.out.println(m1);
	    
	    Set<Entry<Integer, String>> s1  =  m1.entrySet();
	    
	    Iterator<Entry<Integer,String>> s2 =s1.iterator();
	    while(s2.hasNext())
	    {
	    	System.out.println(s2.next());
	    }

	}

}
