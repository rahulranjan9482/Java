// Q:- Write a java program to compare two number.

import java.util.Scanner;

public class Question66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int num1  = in.nextInt();
        System.out.print("Enter second number : ");
        int num2 = in.nextInt();
            if ( num1 == num2 )           
            System.out.printf( "%d == %d\n", num1, num2 );  
        if ( num1 != num2 )          
            System.out.printf( "%d != %d\n", num1, num2 );  
        if ( num1 < num2 )          
            System.out.printf( "%d < %d\n", num1, num2 );  
        if ( num1 > num2 )          
            System.out.printf( "%d > %d\n", num1, num2 );  
        if ( num1 <= num2 )          
            System.out.printf( "%d <= %d\n", num1, num2 );  
        if ( num1 >= num2 )          
            System.out.printf( "%d >= %d\n", num1, num2 );  
        }
    }

