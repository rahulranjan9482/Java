// Q:- Write a java program to get the value of environment variables Path , temp, Username.
import java.lang.*;
 public class Question124 {
 public static void main(String[] args)
 {
	  // gets the value of the specified environment variable "PATH"
      System.out.println("\nEnvironment variable PATH: ");
      System.out.println(System.getenv("PATH"));

      // gets the value of the specified environment variable "TEMP"
      System.out.println("\nEnvironment variable TEMP: ");
      System.out.println(System.getenv("TEMP"));

      // gets the value of the specified environment variable "USERNAME"
      System.out.println("\nEnvironment variable USERNAME: ");
      System.out.println(System.getenv("USERNAME"));
  }
}

