// Q:- Write a java program to test if the first and last elements of an array of integers are the same.The array length must be broder than or equal to 2.
import java.lang.*;
 public class Question109 {
 public static void main(String[] args)
 {
    int[] num_array = {50, -20, 0, 30, 40, 60, 10};
    
	System.out.println (num_array.length >= 2 && num_array[0] ==  num_array[num_array.length-1]);
 }
}
