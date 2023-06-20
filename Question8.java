// Q:- Write a program to sort a string Alphabetically.
import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        String input = "RAHULRANJAN";
        String sortedString = sortString(input);

        System.out.println("Original string: " + input);
        System.out.println("Sorted string: " + sortedString);
    }

    public static String sortString(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);

        return new String(charArray);
    }
}

