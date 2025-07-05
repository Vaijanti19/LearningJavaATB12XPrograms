package Test_05_July;

public class Generic_Method {
    // Generic method to print elements of any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();  // for new line
    }

    public static void main(String[] args) {
        // Test with different types
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Hello", "World"};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(strArray);

        System.out.print("Double Array: ");
        printArray(doubleArray);
    }
}
