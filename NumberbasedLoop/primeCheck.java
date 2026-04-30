package NumberbasedLoop;

import java.util.Scanner;

public class primeCheck {

    public static boolean checkPrime(int digit){
        boolean flag=true;
        for (int i = 2; i < digit; i++) {
            if (digit%i==0) {
                flag=false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i+" ");
            }
            
        }
        
    }
    
}
