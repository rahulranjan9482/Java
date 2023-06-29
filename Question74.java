// Q:- Write a java program to list the avilable character sets in charset objects.
import java.nio.charset.Charset;
public class Question74 {
  public static void main(String[] args) {
	System.out.println("List of available character sets: ");  
    for (String str : Charset.availableCharsets().keySet()) {
      System.out.println(str);
    }
  }
}

