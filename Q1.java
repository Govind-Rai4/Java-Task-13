// Q1: Java program to repeatedly ask for a password until the correct one is entered
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "secret123";
        String enteredPassword;
        
        do {
            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();
        } while (!enteredPassword.equals(correctPassword));
        
        System.out.println("Access granted!");
    }
}