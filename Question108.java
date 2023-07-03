// Q:- Write a java program to test if 10 apperars as the first or last element of an array of integers .The array length must be broader than
// or equal to 2.
import java.lang.*;
 public class Question108 {
 public static void main(String[] args)
 {
    int[] num_array = {10, -20, 0, 30, 40, 60, 10};
    System.out.println((num_array[0] == 10 || num_array[num_array.length-1] == 10));	
 }
}

