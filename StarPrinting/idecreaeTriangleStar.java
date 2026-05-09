package StarPrinting;

import java.util.Scanner;

public class idecreaeTriangleStar {
    
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        for (int i = 0; i < n; i++) {
            for(int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
