package Tasks;
import java.util.Scanner;
public class Task_10_Leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a year
        System.out.print("Enter a year: ");

        // Check if the input is a valid integer
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            return;
        }

        int year = scanner.nextInt();

        // Handle special cases
        if (year == 0) {
            System.out.println("Year 0 does not exist in the Gregorian calendar.");
            return;
        }

        if (year < 0) {
            System.out.println("Negative years are not typically used in the Gregorian calendar.");
            return;
        }

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
