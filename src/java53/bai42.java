package java53;

import java.util.Arrays;

public class bai42 {
	public static void main (String[] args) 
    {  
        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int i,  nums_size = nums.length;
        int left = 0, right = nums_size - 1;
        
        System.out.println("Original Array : "+Arrays.toString(nums));  
 
        while (left < right) 
        {
            
            while (nums[left] == 0 && left < right)
               left++;
 
           
            while (nums[right] == 1 && left < right)
                right--;
 
           
            if (left < right) 
            {
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }
        
       System.out.println("Array after segregation is : "+Arrays.toString(nums));  
    }
}
