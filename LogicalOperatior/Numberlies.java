package LogicalOperatior;

import java.util.Scanner;

public class Numberlies {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();

        if (number>=100 && number<=999) {
            System.out.println("Number is lies between 100 to 999");
        }
        else{
            System.out.println("Number not lies between 100 to 999");
        }
    }
    
}
