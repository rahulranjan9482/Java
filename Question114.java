// Q:- Write a java program to get the largest value between the first and last elements of an array (length 3) of integers.
import java.util.Arrays; 
 public class Question114 {
 public static void main(String[] args)
 {
    int[] array_nums = {20, 30, 40};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int max_val = array_nums[0];
	if(array_nums[2] >= max_val)
		max_val = array_nums[2];
	System.out.println("Larger value between first and last element: "+max_val); 	 
 }
}

