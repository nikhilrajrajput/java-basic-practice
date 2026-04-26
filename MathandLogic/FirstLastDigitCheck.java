package MathandLogic;

import java.util.Scanner;

public class FirstLastDigitCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 digit number");
        int digit= sc.nextInt();
        if (digit<1000 && digit>9999) {
            System.out.println("Please Enter a valid digit number");
        }
        else{
            int firstDigit= digit/1000;
            int lastDigit= digit%10;

            if (firstDigit==lastDigit) {
                    System.out.println("First and last digit are equal");
            }
            else{
                System.out.println("First and last digit are not equal");
            }
        }
    }    
}
