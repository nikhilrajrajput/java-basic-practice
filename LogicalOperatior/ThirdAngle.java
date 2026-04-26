package LogicalOperatior;
import java.util.*;

public class ThirdAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter second angle: ");
        int angle2 = sc.nextInt();

        // The sum of angles in a triangle is always 180
        int angle3 = 180 - (angle1 + angle2);

        if (angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The third angle is: " + angle3);
        } else {
            System.out.println("Invalid angles! A triangle cannot have non-positive angles.");
        }

        sc.close();
    }
}
