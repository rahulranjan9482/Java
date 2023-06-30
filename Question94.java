// Q:- Write a java program to find the penultimate (next to the lost) word in a sentence.

import java.util.Scanner;

public class Question94 {
    public static void main(String[] args) {	
     Scanner in = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
	 String line = in.nextLine();
	 String[] words = line.split("[ ]+");
	 System.out.println("Penultimate word: "+words[words.length - 2]);
	   
    }
}
