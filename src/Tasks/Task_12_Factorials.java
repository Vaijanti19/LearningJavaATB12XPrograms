package Tasks;
import java.math.BigInteger;
import java.util.Scanner;
public class Task_12_Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number to calculate its factorial: ");

        // Handle non-integer inputs
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();

        // Handle edge case for negative numbers
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            scanner.close();
            return;
        }

        // Handle edge case for zero
        if (number == 0) {
            System.out.println("Factorial of 0 is: 1");
            scanner.close();
            return;
        }

        // Use BigInteger to handle large factorials
        BigInteger factorial = BigInteger.ONE;

        // Calculate the factorial using a loop
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        // Print the result
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
