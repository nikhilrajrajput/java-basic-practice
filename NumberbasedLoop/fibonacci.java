package NumberbasedLoop;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0;
        int num2=1;
        System.out.println("Enter the number");
        int n= sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(num1+" ");
            int next= num1+num2;
            num1=num2;
            num2=next;
        }

        
    }
}