package MathematicalLogicPattern;

import java.util.Scanner;

public class divisiblebynum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int n= sc.nextInt();
        System.out.println("Enter the second number");
        int m= sc.nextInt();

        for (int i = n; i <=m; i++) {
            
            if (i%7==0) {
                System.out.println(i+" Number is divisible by 7");
            }
        }
    }
    
}
