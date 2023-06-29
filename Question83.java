// Q:- Write a java program to accept a number and check whether the number is even or not.Prints 1 if the number is even 0 if add.
import java.util.*;
 public class Question83 {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 System.out.print("Input a number: ");
     int n = in.nextInt(); 
            if (n % 2 == 0) {
                System.out.println(1); 
               }
			else {
                System.out.println(0); 
              }
     }
}
