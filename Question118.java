// Q:- Write a java program to take the last three characters from a given string. It will add the three charcters at both the front and back of 
// the front and back of the string .String length must be greater thena three and more.
import java.util.*; 
import java.io.*; 
 public class Question118{
 public static void main(String[] args)
 {
   String string1 = "Python";
    int slength = 3;
    if (slength > string1.length()) {
      slength = string1.length();
    }

    String subpart = string1.substring(string1.length()-3);
    System.out.println(subpart + string1 + subpart);
  }
}

