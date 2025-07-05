package Test_05_July;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;  // Change this to 2 to see successful division

        try {
            int result = numerator / denominator;  // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally {
            System.out.println("This block always executes.");
        }

        System.out.println("Program continues...");
    }
}
