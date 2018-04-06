package java37;

import java.time.LocalTime;

public class bai15 {
	public static void main(String[] args)
    {
      LocalTime time = LocalTime.now(); 
      
      LocalTime newTime = time.plusHours(4);
      System.out.println();
      System.out.println("Time after 2 hours : " + newTime);
      System.out.println();
    }
}
