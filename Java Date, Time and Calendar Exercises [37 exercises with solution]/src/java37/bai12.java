package java37;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class bai12 {
	public static void main(String []args){

		  
		  DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
		   
		    String[] dayNames = symbols.getWeekdays();
		    for (String s : dayNames) { 
		    System.out.print(s + "\n");
			System.out.println();
		    }
		  }
}
