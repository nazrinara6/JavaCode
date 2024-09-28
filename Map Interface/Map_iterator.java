package map_package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_iterator {

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String,String>();
	    m1.put("GTM11", "Annu");
	    m1.put("GTM12", "Yamini");
	    m1.put("GTM13", "Upoma");
	    m1.put("GTM14", "Nisha");
	    System.out.println(m1);
	    
	    Set<Entry<String, String>> s1 = m1.entrySet();
	    
	    Iterator<Entry<String,String>> s2 = s1.iterator();
	    while (s2.hasNext()) 
	    {
			System.out.println(s2.next());
		}
	    
	}

}
