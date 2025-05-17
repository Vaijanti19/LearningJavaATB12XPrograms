package Tasks;

public class Task_04_Ternary_Operator {
        public static void main(String[] args) {
            int age=15;
            String Category= (age<18)? "Minor":(age>65)?"Senior":"Adult";

            System.out.println(Category);
        }
    }
