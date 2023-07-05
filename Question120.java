// Q:- Write a java program string with an integers n,divide it by 2if it is even , or multiply it by 3 and add if it is odd .Repeat the process 
// until n=1;
 import java.util.Scanner;

public class Question120 {
	public static void main(String[] args) {
		System.out.println("Input the value of n: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;				
			}
			else {
				n = (3 * n + 1) / 2;				
			}
		}
		System.out.println("\nValue of n = "+n);
		in.close();
	}
}

