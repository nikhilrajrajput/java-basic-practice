package LogicOperator;

import java.util.Scanner;

public class checkIncometax {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age= sc.nextInt();
        System.out.println("Enter income");
        int income= sc.nextInt();

        if (age>=18 && income>=50000) {
            System.out.println("Applicable for income tax");
            
        }
        else{
            System.out.println("Not applicable for income tax");
        }
    }
    
}
