// Q:- Write a java program and compute the sum of an integers digits.

import java.util.Scanner;

public class Question67{
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number : ");
    long num1 = in.nextLong();
    int sum = 0;
    while(num1 != 0){
        sum +=num1%10;
        num1 /= 10;
    }
        System.out.print(sum);
 }
}