package Test_05_July;

public class Wrapper_Find_Max_Value {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 5, 30, 15};

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        Integer max = arr[0];  // assume first element is max
        for (Integer num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum value: " + max);
    }
}
