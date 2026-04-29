package LogicOperator;

import java.util.Scanner;

public class weekWeekend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
       if (i>=1 && i<=5) {
        System.out.println("Weekday");
       }
       else if(i==6 || i==7){
        System.out.println("Weekend");
       }
       else{
        System.out.println("Please enter number between 1 and 7");
       }
    }
    
}
