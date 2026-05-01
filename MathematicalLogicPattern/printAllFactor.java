package MathematicalLogicPattern;

import java.util.Scanner;

public class printAllFactor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int n= sc.nextInt();

        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                System.out.print(i+" ");
            }
        }
    }
    
}
