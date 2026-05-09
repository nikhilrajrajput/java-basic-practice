package StarPrinting.NumberPattern;

import java.util.Scanner;

public class starCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();
        int counter = 1;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    
}
