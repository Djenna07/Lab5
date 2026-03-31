import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Step 2: Concatenate
        String concat1 = str1.concat(str2); // str1 + str2
        String concat2 = str2.concat(str1); // str2 + str1

        // Step 3: Display results
        System.out.println("First + Second: " + concat1);
        System.out.println("Second + First: " + concat2);

        // Step 4: Compare
        if (concat1.equals(concat2)) {
            System.out.println("The concatenations are equal.");
        } else {
            System.out.println("The concatenations are NOT equal.");
        }

        scanner.close();
    }
}