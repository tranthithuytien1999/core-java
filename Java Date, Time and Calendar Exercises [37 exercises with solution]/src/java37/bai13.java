package java37;

import java.util.Calendar;

public class bai13 {
	public static void main(String []args){
	    
	        Calendar cal = Calendar.getInstance();
	
		System.out.println();
	        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	        System.out.println("Day of the week : " + dayOfWeek); 
		System.out.println();
	    }
}
