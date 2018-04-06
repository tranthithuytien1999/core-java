package java37;

import java.util.Calendar;

public class bai8 {
	 public static void main(String[] args)
	    {
	        Calendar cal = Calendar.getInstance();
		  System.out.println();
	        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	        System.out.println(cal.getTime());
			System.out.println();
	    }
}
