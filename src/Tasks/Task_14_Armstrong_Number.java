package Tasks;
import java.util.Scanner;
public class Task_14_Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number to check if it's an Armstrong number: ");

        // Handle non-integer input
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();

        // Handle edge case for negative numbers
        if (number < 0) {
            System.out.println("Armstrong numbers are not defined for negative numbers.");
            scanner.close();
            return;
        }

        // Calculate the number of digits in the number
        int temp = number;
        int numDigits = 0;
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }

        // Calculate the sum of digits raised to the power of the number of digits
        int sum = 0;
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        // Check if the sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
