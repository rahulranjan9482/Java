// Q:- Write a program in java to reverse in java.
public class Question6 {
    public static void main(String[] args) {
        String originalString = "PW SKILLS";
        String reversedString = reverseString(originalString);

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        
        // Iterate through the characters of the input string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}
