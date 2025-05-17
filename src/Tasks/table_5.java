package Tasks;

public class table_5 {
    public static void printTable(int num, int multiplier) {
        if (multiplier > 10) {
            return;
        }
        System.out.println(num + " x " + multiplier + " = " + (num * multiplier));
        printTable(num, multiplier + 1);
    }

    public static void main(String[] args) {
        printTable(5, 1);
    }
}
