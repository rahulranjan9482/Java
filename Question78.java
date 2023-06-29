// Q:- Write a java program that program that accepts an integers(n) and computes the value of n+nn+nnn.
import java.util.Scanner;
public class Question78{
 public static void main(String[] args) {

  int n;
  char s1, s2, s3;
  Scanner in = new Scanner(System.in);
  System.out.print("Input number: ");
  n = in .nextInt();
  System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
 }
}

