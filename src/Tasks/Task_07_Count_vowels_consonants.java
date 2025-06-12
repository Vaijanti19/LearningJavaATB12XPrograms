package Tasks;
import java.util.Scanner;
public class Task_07_Count_vowels_consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Variables to count vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Convert to lowercase to handle case sensitivity
            ch = Character.toLowerCase(ch);

            // Check if character is alphabetic
            if (Character.isAlphabetic(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Output results
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        scanner.close();
    }
}
