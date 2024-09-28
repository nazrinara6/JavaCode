package map_package;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods_1 {

	public static void main(String[] args) {
    
	    Map<String, String> m1 = new HashMap<String,String>();
	    m1.put("GTM11", "Annu");
	    m1.put("GTM12", "Hamida");
	    m1.put("GTM13", "Upoma");
	    m1.put("GTM14", "Lipsi");
	    System.out.println(m1);
	    
	    Map<String, String> m2 = new HashMap<String,String>();
	    m2.put("GTM15", "Anant");
	    m2.put("GTM16", "Yamini");
	    m2.put("GTM17", "Sradya");
	    m2.put("GTM18", "Sahil");
	    System.out.println(m2);
	    
	    //equals
	    boolean m3 = m1.equals(m2);
	    System.out.println(m3);
	    
	    //putAll
	    m1.putAll(m2);  //putAll m1 in m2
	    System.out.println(m1);
	    
	    //clear
	    m1.clear();
	    System.out.println(m1);
	    //isEmpty
	    System.out.println(m1.isEmpty());
	    
	    //putIfAbsent
	    m1.putIfAbsent("GTM14", "Lipsi");
	    System.out.println(m1);

	}

}

