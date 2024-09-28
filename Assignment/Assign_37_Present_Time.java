package core_java_assignment;

import java.util.Date;

public class Assign_37_Present_Time {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
	
		System.out.println(d2);
		
		String current_time = d2.toString();
		System.out.println(current_time);
		String year = current_time.substring(current_time.length()-4);
		System.out.println(year);
		String month = current_time.substring(4, 7);
		System.out.println(month);
		String date = current_time.substring(8, 10);
		System.out.println(date);
		
	
	}

	

}
