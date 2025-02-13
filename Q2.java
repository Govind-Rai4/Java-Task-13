// Q2: Java program to count occurrences of a specific word in a sentence using a for loop
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to count: ");
        String word = scanner.next();
        
        String[] words = sentence.split("\\s+");
        int count = 0;
        
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        
        System.out.println("The word '" + word + "' appears " + count + " times.");
    }
}