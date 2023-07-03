// Q:- Write a java program to insert a word in the middle of a another string .Insert "Tutorial" in the middle of "python3.0",so the result 
// will be python Tutorial3.0.
import java.lang.*;
 public class Question102 {
 public static void main(String[] args)
 {
   String main_string = "Python 3.0";
   String word = "Tutorial";
   System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));
	}
}

