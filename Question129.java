// Q:- Write a java program to create an array (length #0) of string values. The elements will contain "0","1","2".....through..n-1.
import java.util.*; 
import java.io.*; 
 public class Question129{
 public static void main(String[] args)
 {
    int n= 5;
	String[] arr_string = new String[n];
	
    for(int i = 0; i < n; i++)
        arr_string[i] = String.valueOf(i);                                  
	 System.out.println("New Array: "+Arrays.toString(arr_string)); 
	 }
}

