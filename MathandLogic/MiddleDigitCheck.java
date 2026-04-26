package MathandLogic;
import java.util.*;

public class MiddleDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        // Validate input
        if (n < 100 || n > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            int first = n / 100;          // extract first digit
            int middle = (n / 10) % 10;   // extract middle digit
            int last = n % 10;            // extract last digit

            if (middle > first && middle > last) {
                System.out.println("The middle digit is the largest.");
            } else if (middle < first && middle < last) {
                System.out.println("The middle digit is the smallest.");
            } else {
                System.out.println("The middle digit is neither largest nor smallest.");
            }
        }

        sc.close();
    }
}
