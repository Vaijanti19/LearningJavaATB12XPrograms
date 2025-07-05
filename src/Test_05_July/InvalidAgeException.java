package Test_05_July;
import java.util.Arrays;

public class InvalidAgeException extends Exception {
    // Constructor with no arguments
    public InvalidAgeException() {
        super();
    }

    // Constructor with a message
    public InvalidAgeException(String message) {
        super(message);
    }

    // Validation method (static)
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18. Provided age: " + age);
        }
        System.out.println("Age is valid: " + age);
    }

    // Main method to test validation
    public static void main(String[] args) {
        try {
            validateAge(16);  // This will throw exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            validateAge(20);  // This is valid
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}