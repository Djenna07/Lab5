import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Step 2: Convert to lowercase
        word = word.toLowerCase();

        // Step 3: Reverse the word
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Step 4: Check palindrome
        if (word.equals(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}