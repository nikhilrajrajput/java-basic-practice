package NestedIfMultipleCondition;
import java.util.*;;

public class validTraingle{

    public static void validTraingle(int a,int b,int c){

        if( (a+b)>c){
            System.out.println("It's a valid triangle");
        }
        else if( (a+c)>b){
            System.out.println("It's a valid triangle");
        }
        else if( (c+b) >a){
            System.out.println("It's a unvalid triangle");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc.nextInt();
        System.out.println("Enter the third number");
        int num3= sc.nextInt();

        validTraingle(num1, num2, num3);
    }
}