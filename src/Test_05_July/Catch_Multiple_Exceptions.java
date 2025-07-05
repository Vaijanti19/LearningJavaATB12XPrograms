package Test_05_July;

public class Catch_Multiple_Exceptions {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            // Uncomment one of these lines at a time to test each exception

            // Causes ArithmeticException (division by zero)
            //int result = numbers[1] / 0;
          //  System.out.println("Result: " + result);

            // Causes ArrayIndexOutOfBoundsException (invalid index)
            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
