// Q:- Write a program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class Question41{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num1 = in.nextInt();
        for(int i=1 ;i<=10 ; i++){
            System.out.println(num1 +"*" +i+"= "+num1*i);
        }
    }
}
