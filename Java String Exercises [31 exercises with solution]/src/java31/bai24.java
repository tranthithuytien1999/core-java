package java31;

public class bai24 {
	public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog.";

       
        String new_str = str.replace('d', 'f');

      
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}