package LogicalLoopCombination;

import java.util.Scanner;

public class divisiblecondition {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            if (i%7==0 && i%5 !=0) {
                System.out.print(i+" ");
            }
        }
    }
}
