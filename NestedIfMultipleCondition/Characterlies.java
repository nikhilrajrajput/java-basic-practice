package NestedIfMultipleCondition;

import java.util.Scanner;

public class Characterlies {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please write one small character ");
        Character ch= sc.next().charAt(0);

        if (ch>='a' && ch<='m') {
            System.out.println("The character lies between a and m");
        }
        else if(ch>='n' && ch<='z'){
            System.out.println("The character lies between n and z");
        }
        else{
            System.out.println("Invalid Character");
        }
    }
    
}
