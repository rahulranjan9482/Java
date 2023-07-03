// Q:- Write a java program to test that a given array (length 3) of integers in the left direction.
import java.util.Arrays; 
 public class Question113{
 public static void main(String[] args)
 {
    int[] array_nums = {20, 30, 40};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int[] new_array_nums = {array_nums[1], array_nums[2], array_nums[0]};
	System.out.println("Rotated Array: "+Arrays.toString(new_array_nums)); 	 
 }
}

