// Q:- Write a java program to calcuate the sum of two integers and return true if the sum is equal to third integers.
import java.util.*;
 public class Question85 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
        System.out.print("The result is: "+sumoftwo(x, y, z));
		System.out.print("\n");
    }
    
    public static boolean sumoftwo(int p, int q, int r)
      {	
         return ((p + q) == r || (q + r) == p || (r + p) == q);	
	   }
}
