package MathematicalLogicPattern;

import java.util.Scanner;

public class lcmtwonumber {
    
   public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM using formula: (a * b) / GCD(a, b)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate and print LCM
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));

        sc.close();
    }
}
