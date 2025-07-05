package Test_05_July;

import java.util.Arrays;

public class Generic_Swap_Method {
    // Generic method to swap two elements in an array
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Fixed main method
    public static void main(String[] args) {
        String[] digits = {"1", "2", "3"};  // variable name lowercase

        System.out.println("Before swap: ");
        for (String digit : digits) {       // loop variable digit, iterate over digits
            System.out.print(digit + " ");
        }
        System.out.println();

        swap(digits, 0, 2);

        System.out.println("After swap: ");
        for (String digit : digits) {       // iterate over digits again
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
