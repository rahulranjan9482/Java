// Q:- Write a java program to measure how long code executes in nonoseconds.
import java.lang.*;
 public class Question125 {
 public static void main(String[] args)
 {    
    long startTime = System.nanoTime(); 
	// Sample program
	// Display the first 10 natural numbers.
	int i;
	System.out.println ("The first 10 natural numbers are:\n");
	for (i=1;i<=10;i++)
	{      
		System.out.println (i);
	}
		long estimatedTime = System.nanoTime() - startTime;
	System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: "+estimatedTime);
  }
}

