package Test_05_July;

public class Generic_Bounded_Type {
    // Generic method that accepts only numbers and returns their sum
    public static <T extends Number> double sumOfNumbers(T[] numbers) {
        double sum = 0.0;
        for (T num : numbers) {
            sum += num.doubleValue();  // Convert to double for addition
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30};
        Double[] doubleArray = {1.5, 2.5, 3.0};
        Float[] floatArray = {1.0f, 2.0f, 3.0f};

        System.out.println("Sum of integers: " + sumOfNumbers(intArray));      // 60.0
        System.out.println("Sum of doubles: " + sumOfNumbers(doubleArray));    // 7.0
        System.out.println("Sum of floats: " + sumOfNumbers(floatArray));      // 6.0
    }
}
