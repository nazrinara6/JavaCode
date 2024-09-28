package map_package;

import java.util.HashMap;
import java.util.Map;

public class Map_Method_2 {

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String,String>();
	    m1.put("GTM11", "Annu");
	    m1.put("GTM12", "Hamida");
	    m1.put("GTM13", "Upoma");
	    m1.put("GTM14", "Lipsi");
	    System.out.println(m1);
	    
	    //containsKey
	    boolean b1 = m1.containsKey("GTM12");   //check if the given key is present or not
	    System.out.println(b1);
	    
	    //containsValue
	    boolean b2 = m1.containsValue("Upoma"); //check if the given value is present or not
	    System.out.println(b2);
	    boolean b3 = m1.containsValue("Farha");
	    System.out.println(b3);


	}

}
