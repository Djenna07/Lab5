import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        // Step 1: Create array
        int[] numbers = new int[10];
        Random rand = new Random();

        // Step 2: Fill array with random numbers (1–100)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }

        // Step 3: Initialize min and max
        int min = numbers[0];
        int max = numbers[0];

        // Step 4: Find min and max
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Step 5: Display results
        System.out.println("Array values:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nMinimum: " + min);
        System.out.println("Maximum: " + max);
    }
}