package map_package;

import java.util.HashMap;
import java.util.Map;

public class Map_Behaviour {

	public static void main(String[] args) {
		
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("Nazrin", 11511);
		m1.put("Tamanna", 116023);
		m1.put("Farha", 115008);
		System.out.println(m1);
		
		Map<String,Integer> m2 = new HashMap<String,Integer>();
		m2.put("Nizam", 11541);
		m2.put("Ahmed", 116121);
		m2.put("Fahim", 115898);
		System.out.println(m2);
	}

}
