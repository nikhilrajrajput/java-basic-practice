package MathematicalLogicPattern;

import java.util.Scanner;

public class sumofAllFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number");
        int n= sc.nextInt();

        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    
}
