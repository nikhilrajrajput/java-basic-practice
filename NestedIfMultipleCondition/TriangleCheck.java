package NestedIfMultipleCondition;
import java.util.Scanner;

public class TriangleCheck {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc.nextInt();
        System.out.println("Enter the third number");
        int num3= sc.nextInt();

        if (num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2) {
            // Now check if it's equilateral
            if (num1 == num2 && num2 == num3) {
                System.out.println("The triangle is Equilateral.");
            } else {
                System.out.println("The triangle is not Equilateral.");
            }
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

    }
}