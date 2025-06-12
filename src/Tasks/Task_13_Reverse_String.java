package Tasks;
import java.util.Scanner;
public class Task_13_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();

        // Handle edge case for empty input
        if (inputString.isEmpty()) {
            System.out.println("Input string is empty. Nothing to reverse.");
            return;
        }

        // Reverse the string using StringBuilder
        String reversedString = new StringBuilder(inputString).reverse().toString();

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
