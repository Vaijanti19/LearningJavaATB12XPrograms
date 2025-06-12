package Tasks;
import java.util.Scanner;
public class Task_15_Tringle_type {
    public static void main(String[] args) {

        System.out.println("Enter Angle 1:");
        Scanner sc1 = new Scanner(System.in);
        int angle1 = sc1.nextInt();

        System.out.println("Enter Angle 2:");
        Scanner sc2 = new Scanner(System.in);
        int angle2= sc2.nextInt();

        System.out.println("Enter Angle 3:");
        Scanner sc3 = new Scanner(System.in);
        int angle3= sc3.nextInt();

        if (angle1 == angle2 && angle2 == angle3) {
            System.out.println("Its an Equilateral Triangle");
        }
        else if (angle1 == angle2 || angle1 == angle3 || angle2 ==angle3) {
            System.out.println("Its an Isosceles Triangle");
        }
        else{
            System.out.println("Its a scalene Triangle");
        }
    }
}
