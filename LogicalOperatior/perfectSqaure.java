package LogicalOperatior;

import java.util.Scanner;

public class perfectSqaure {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Handle negative numbers
        if (n < 0) {
            System.out.println(n + " is NOT a Perfect Square.");
        } else {
            // Find integer square root using Math.round
            int root = (int) Math.round(Math.pow(n, 0.5));

            if (root * root == n) {
                System.out.println(n + " is a Perfect Square.");
            } else {
                System.out.println(n + " is NOT a Perfect Square.");
            }
        }


    }
    
}
