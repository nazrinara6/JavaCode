package core_java_assignment;

import java.util.Date;

public class Assign_38_Future_Time {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime() + (1000*60*60*24*2));
		           //d1.getTime()+(1000*60*60*24*2) - 2 day after
		System.out.println(d2);
		
		String future_time = d2.toString();
		System.out.println(future_time);
		String year = future_time.substring(future_time.length()-4);
		System.out.println(year);
		String month =future_time.substring(4, 7);
		System.out.println(month);
		String date = future_time.substring(8, 10);
		System.out.println(date);

	}

}


