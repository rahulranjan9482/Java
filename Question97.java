// Q:- Write a java program that accepts two integers values from the user and returns the largest value. However if the two values are the 
// same return 0 and find the smallest value if the two values have the some reminder when divided by 6.
import java.util.*;
 public class Question97 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		System.out.println("Result: "+result(a, b));
    }
	public static int result(int x, int y)
     {  
	if(x == y)
		return 0;
	    if(x % 6 == y % 6)
		    return (x < y) ? x : y;
	    return (x > y) ? x : y;
     }
}

