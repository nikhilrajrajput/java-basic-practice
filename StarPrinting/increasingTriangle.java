package StarPrinting;

import java.util.Scanner;

public class increasingTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        for (int i = n-1; i>=0; i--) {
                for (int j = 0; j < n-i; j++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
    
}
