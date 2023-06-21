// Q:- Write a java program that takes two numbers as input and display the product of two numbers.

import java.util.Scanner;

public class Question39 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       System.out.println("enter first number: ");
       int num1 = in.nextInt();
       System.out.println("enter second number : ");
       int num2 = in.nextInt();
       int product = num1*num2;
       System.out.println(product);
    }
}
