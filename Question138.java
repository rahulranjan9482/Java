// Q:- Write a java program to create an array from a given array of integers. The newly created array will contain the elements from the given 
// array before the last element value of 10.
import java.util.*; 
import java.io.*; 
 public class Question138 {
 public static void main(String[] args)
 {
	int[] array_nums = {11, 15, 13, 10, 45, 20, 33, 53};
    int result = 0; 
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	
	int l = 0;
	int[] new_array;
	while(array_nums[l] != 10)
	  l++;
	new_array = new int[l];
	for(int i = 0; i < l; i++)
		new_array[i] = array_nums[i];
	System.out.println("New Array: "+Arrays.toString(new_array)); 
  }
}

