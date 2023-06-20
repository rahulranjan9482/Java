// Q:- Write a program to reverse a sentence while preversing the position 
public class Question7 {
    public static void main(String[] args) {
        String sentence = "Think Twice";
        String reversedSentence = reverseSentence(sentence);

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseSentence(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}
