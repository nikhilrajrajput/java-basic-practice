package MathematicalLogicPattern;

import java.util.Scanner;

public class strongNumber {

    public static int factorial(int num){
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int original= sc.nextInt();
        int ori=original;
        int sum=0;
        while (original>0) {
            int temp=original%10;
            sum+=factorial(temp);
            original/=10;
        }

        if (ori==sum) {
            System.out.println("It's a strong number");
        }
        else{
            System.out.println("It's not a strong number");
        }
    }
    
}
