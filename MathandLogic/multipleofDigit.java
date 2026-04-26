package MathandLogic;

import java.util.Scanner;

public class multipleofDigit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter the number");
        int number=sc.nextInt();

        if (number%10==7 || number%7==0) {
            System.out.println("Number is multiple of 7 or ends with 7");
        }
        else{
            System.out.println("Number is not multiple of 7 or ends with 7");
        }
    }
}
