// Q:- Write a java program to convert seconds to hours , minutes and seconds.

import java.util.Scanner;

public class Question89 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Input seconds : ");
       int num1 = in.nextInt();
       int s = num1%60;
       int h = num1/60;
       int m = h%60;
       h = h/60;
      System.out.print(h+ ":"+m+":"+s);
    }
}
