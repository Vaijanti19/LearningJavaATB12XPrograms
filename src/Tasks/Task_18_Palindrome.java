package Tasks;

public class Task_18_Palindrome {
    public static void main(String[] args) {

        String str = new String("Hello OLleh");
        String rev = "";
        System.out.println(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);

        }
        System.out.println(rev);
        if (rev.equalsIgnoreCase(str)) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");

        }
    }
}
