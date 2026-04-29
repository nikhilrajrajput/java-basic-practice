package LogicOperator;

import java.util.Scanner;

public class printDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr= {"zero","one","two","three","four","five","six","seven","eight","nine"};

        System.out.println("Enter the number between 0 to 9");
        int n=sc.nextInt();

        if (n>=0 && n <=9) {
            System.out.println(arr[n]);
        }
        else{
            System.out.println("Number not lies between 0 to 9");
        }
    
    
    }
    
}
