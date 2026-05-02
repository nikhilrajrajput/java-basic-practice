package MathematicalLogicPattern;

import java.util.Scanner;

public class hcftwonum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int temp=0;
        for (int i = 1; i <=b; i++) {
            if (a%i==0 && b%i==0) {
                temp=i;
            }
        }

        System.out.println("HCF is "+temp);
    }
    
}
