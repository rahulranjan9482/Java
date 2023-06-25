// Q:- Write a java program to compute the area of a polygon.

import java.util.Scanner;

public class Question69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number of side : ");
        double num1 = in.nextDouble();
        System.out.print("enter a length of sides : ");
        double num2 = in.nextDouble();
        double area = (num1*num2*num2)/(4*Math.tan(Math.PI/num1));
        System.out.print("Area of a polygon : "+area);
    }
}
