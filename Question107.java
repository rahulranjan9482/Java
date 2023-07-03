// Q:- Write a java program to create a string taking the first and last characters from two given strings  if the string length of each string
// is 0 use # for missing characters.
import java.lang.*;
 public class Question107 {
 public static void main(String[] args)
 {
    String str1 = "Python"; 
	String str2 = ""; 
	
	int length2 = str2.length();
	String result = "";
	result += (str1.length() >= 1) ? str1.charAt(0) : '#';
	result += (length2 >= 1) ? str2.charAt(length2-1) : '#';
	System.out.println(result);
 }
}
