// Q:- Write a java program to create a string in the form of short-string +long-string +short -string from two strings. The strings must not have
// same length.
import java.lang.*;
 public class Question104 {
 public static void main(String[] args)
 {
    String str1 = "Python";    
	String str2 = "Tutorial"; 
	
	if(str1.length() >= str2.length())
		System.out.println( str2+str1+str2);
	else
	System.out.println(str1+str2+str1);	
  } 
}
