// Q:- Write a java program to test if the first and last element of two integer array are the same. The array length must be greater than or equal to 2.
public class Question110 {
 public static void main(String[] args)
 {
  //false
  int[] num_array1 = {50, -20, 0, 30, 40, 60, 12};
	int[] num_array2 = {45, 20, 10, 20, 30, 50, 11};
	
	//true
	//int[] num_array1 = {50, -20, 0, 30, 40, 60, 12};
	//int[] num_array2 = {45, 20, 10, 20, 30, 50, 12};
	
	//Array lengths less than 2.
	//int[] num_array1 = {50};
	//int[] num_array2 = {45};
	
  if(num_array1.length>=2 && num_array2.length>=2)
  {
	  System.out.println(num_array1[0] == num_array2[0] || num_array1[num_array1.length-1] == num_array2[num_array2.length-1]);
  }
  else
  {
   System.out.println("Array lengths less than 2.");
  }
 }
}

