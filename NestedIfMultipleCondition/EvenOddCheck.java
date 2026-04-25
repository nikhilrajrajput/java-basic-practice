package NestedIfMultipleCondition;
import java.util.*;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        // Check conditions using modulo operator
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even.");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both numbers are odd.");
        } else {
            System.out.println("One number is even and the other is odd.");
        }
    }
}
