package Tasks;
import java.util.Scanner;
public class Task_06_Reverse_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // To handle negative numbers
        boolean isNegative = number < 0;

        // If the number is negative, work with its absolute value
        number = Math.abs(number);

        int reversed = 0;

        // Reversing the number
        while (number != 0) {
            int digit = number % 10;         // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            number /= 10;                    // Remove last digit
        }

        // If the number was negative, make the result negative
        if (isNegative) {
            reversed = -reversed;
        }

        // Output result
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}

