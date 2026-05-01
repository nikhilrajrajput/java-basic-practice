package MathematicalLogicPattern;

import java.util.Scanner;

public class squareN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Square of "+i +" is "+ i*i);
        }
    }
    
}
