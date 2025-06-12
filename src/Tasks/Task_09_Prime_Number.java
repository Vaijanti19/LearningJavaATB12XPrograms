package Tasks;
import java.util.Scanner;

public class Task_09_Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrime(num);

        // Output result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Only need to check up to the square root of the number for efficiency
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }

        return true; // Number is prime if no divisors were found
    }
}
