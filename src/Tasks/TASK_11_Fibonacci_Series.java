package Tasks;
import java.util.Scanner;
public class TASK_11_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Handle edge case for invalid input
        if (terms <= 0) {
            System.out.println("Please enter a positive integer for the number of terms.");
            return;
        }

        // Print the Fibonacci series
        System.out.println("Fibonacci Series up to " + terms + " terms:");

        // First two numbers in the Fibonacci series
        long first = 0, second = 1;

        // For the first term (0), print 0
        if (terms >= 1) {
            System.out.print(first + " ");
        }

        // For the second term (1), print 1
        if (terms >= 2) {
            System.out.print(second + " ");
        }

        // Print the rest of the Fibonacci series
        for (int i = 3; i <= terms; i++) {
            long nextTerm = first + second;
            System.out.print(nextTerm + " ");

            // Update the first and second terms for the next iteration
            first = second;
            second = nextTerm;
        }

        scanner.close();
    }
}
