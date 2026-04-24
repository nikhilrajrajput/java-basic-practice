package SimpleConditions;
import java.util.Scanner;

public class larget3one {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int num1 = sc.nextInt();
        System.out.println("Enter second numbers");
        int num2 = sc.nextInt();
        System.out.println("Enter third numbers");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1+ "is the largerst number");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 +" is the largerst number");
        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3 + " is the largerst number");
        }
        else{
            System.out.println("All numbers are equal");
        }

    }
    
}
