package Tasks;
import java.util.Scanner;

public class Task_08_Palidrome_of_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Clean the string: Remove non-alphabetic characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Edge case for empty or one-character strings (palindrome by default)
        if (cleanedInput.length() <= 1) {
            System.out.println("The string is a palindrome.");
            scanner.close();
            return;
        }

        // Check if the cleaned string is a palindrome
        boolean isPalindrome = isPalindrome(cleanedInput);

        // Output the cleaned version and result
        System.out.println("Cleaned string for palindrome check: " + cleanedInput);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome if characters don't match
            }
            start++;
            end--;
        }
        return true; // It's a palindrome if all characters match
    }
}
