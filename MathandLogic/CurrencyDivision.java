package MathandLogic;
import java.util.*;

public class CurrencyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        // Check divisibility
        if (amount % 2000 == 0) {
            System.out.println("The amount can be evenly divided into 2000 notes.");
        } else if (amount % 500 == 0) {
            System.out.println("The amount can be evenly divided into 500 notes.");
        } else if (amount % 100 == 0) {
            System.out.println("The amount can be evenly divided into 100 notes.");
        } else {
            System.out.println("The amount cannot be evenly divided into 2000, 500, or 100 notes.");
        }

        sc.close();
    }
}
