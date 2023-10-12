import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first 4-bit binary number
        System.out.print("Enter the first 4-bit binary number: ");
        String binary1 = scanner.next();

        // Input the second 4-bit binary number
        System.out.print("Enter the second 4-bit binary number: ");
        String binary2 = scanner.next();

        // Check if the input strings are exactly 4 characters long
        if (binary1.length() != 4 || binary2.length() != 4) {
            System.out.println("Please enter valid 4-bit binary numbers.");
        } else {
            // Convert the binary strings to integers
            int num1 = Integer.parseInt(binary1, 2);
            int num2 = Integer.parseInt(binary2, 2);

            // Perform binary addition
            int sum = num1 + num2;

            // Convert the result back to a 4-bit binary string
            String binarySum = Integer.toBinaryString(sum);

            // Ensure the result is 4 bits long
            while (binarySum.length() < 4) {
                binarySum = "0" + binarySum;
            }

            System.out.println("Binary Addition Result: " + binarySum);
        }

        scanner.close();
    }
}
