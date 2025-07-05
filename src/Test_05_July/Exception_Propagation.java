package Test_05_July;

public class Exception_Propagation {
    // Level 1: This method throws an exception
    static void methodA() {
        System.out.println("Inside methodA");
        int result = 10 / 0;  // This will throw ArithmeticException
        System.out.println("End of methodA");  // This line won't execute
    }

    // Level 2: This method calls methodA
    static void methodB() {
        System.out.println("Inside methodB");
        methodA();  // Exception propagates to here
        System.out.println("End of methodB");
    }

    // Level 3: This is the main method
    public static void main(String[] args) {
        try {
            methodB();  // Exception propagates to here and is caught
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e);
        }
        System.out.println("Program continues after exception handling.");
    }
}
