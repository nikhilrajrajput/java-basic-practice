package NestedIfMultipleCondition;

import java.util.Scanner;

public class Grade {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade");
        int grade=sc.nextInt();

        if (100<grade) {
            System.out.println("Invalid Grade Please Enter teh the numer bwetween 1 to 100");
        }
        else if(75<grade ){
            System.out.println("Excellent");
        }
        else if(50<grade){
            System.out.println("pass");
        }
        else if(1<grade){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid ");
        }
    }
}
