public class Task3 {
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];
        int sum = 0;

        // Fill the diagonal and calculate sum
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    matrix[i][j] = i;
                    sum += i;
                }
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the sum
        System.out.println("\nSum of diagonal elements = " + sum);
    }
}