package NumberbasedLoop;

import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int sum = 0;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\nSum of first " + n + " terms = " + sum);
        sc.close();
    }
}

