// Q:- Write a java program that takes three numbers as input to calculate and print the average of the numbers .

import java.util.Scanner;

public class Question46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number : ");
        int num1 = in.nextInt();
        System.out.println("enter second number : ");
        int num2 = in.nextInt();
        System.out.println("enter third number : ");
        int num3 = in.nextInt();
        double Average = (num1+num2+num3)/3;
    System.out.println("average of three numbers is : "+Average);
    }
}
