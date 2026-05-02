package MathematicalLogicPattern;

import java.util.Scanner;

public class GPSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first term, common ratio, and number of terms
        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("Geometric Progression:");
        int term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term *= r; // multiply by ratio for next term
        }
    }
}
