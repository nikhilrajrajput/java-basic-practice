package NumberbasedLoop;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        Boolean flag=true;

        for (int i = 2; i < n; i++) {
            
            if (n%i==0) {
                flag=false;
            }

        }
        if (flag) {
            System.out.println("It's a prime number");
        }
        else{
            System.out.println("It's not a prime number");
        }
    }
    
}
