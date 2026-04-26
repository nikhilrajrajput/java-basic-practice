package MathandLogic;

import java.util.Scanner;


public class checkCountDigit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int digit = sc.nextInt();

        if (digit>=0 &&  digit<=9) {
            System.out.println("It's a single digit number");
        }
        else if (digit>=10 && digit <= 99) {
            System.out.println("It's a double digit number");
        }
        else{
            System.out.println("It's a mutiple digit number");
        }
    }
}
