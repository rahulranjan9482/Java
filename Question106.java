// Q:- Write a java program to create a string taking the first three characters from a given string.If the string length is less than 3 use "#"
// as substitute charcters .
import java.lang.*;
 public class Question106 {
 public static void main(String[] args)
 {
    String str1 = "";    
	int len = str1.length();
	if(len >= 3)
		System.out.println( str1.substring(0, 3));
	else if(len == 1)
		System.out.println( (str1.charAt(0)+"##"));
	else
		System.out.println("###");
	}
}

