package java37;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class bai36 {
	 public static void main(String[] args)
	   {
	 
	   long unix_seconds = 1372339860;
	   
	   Date date = new Date(unix_seconds*1000L); 
	
	   SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
	   jdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));
	   String java_date = jdf.format(date);
	   System.out.println("\n"+java_date+"\n");
	   }
}
