package MathandLogic;
import java.util.*;

public class QuadrantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("The point lies in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point lies in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point lies in Quadrant III.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point lies in Quadrant IV.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point lies at the Origin.");
        } else if (x == 0) {
            System.out.println("The point lies on the Y-axis.");
        } else if (y == 0) {
            System.out.println("The point lies on the X-axis.");
        }

        sc.close();
    }
}
