package Test_05_July;

public class unboxing {
    public static void main(String[] args) {
        // Autoboxing: automatically converting int to Integer object
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt;  // Autoboxing happens here
        System.out.println("Autoboxed:" + primitiveInt);

        // Unboxing: automatically converting Integer object to int
        Integer anotherWrappedInt = new Integer(10);
        int anotherPrimitiveInt = anotherWrappedInt;  // Unboxing happens here
        System.out.println("Unboxed:" + anotherWrappedInt);
    }
}
