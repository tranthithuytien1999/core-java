package javanangcao;

import java.util.Scanner;

public class bai32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int number1; // first number to compare       
        int number2; // second number to compare  
      
        System.out.print( "Input first integer: " ); // prompt        
        number1 = input.nextInt(); // read first number from user   
 
        System.out.print( "Input second integer: " ); // prompt        
        number2 = input.nextInt(); // read second number from user               
        
        if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 );  
	}

}
