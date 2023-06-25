// Q:- Write a java program to compute hexagonal area.

import java.util.Scanner;

public class Question68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of haxagonal : ");
        double side = input.nextDouble();
        System.out.print("Area of hexagonal is : " +hexagonArea(side));
    }
         public static double hexagonArea(double side) {
        return (6*(side*side))/(4*Math.tan(Math.PI/6));
         }
    
}
