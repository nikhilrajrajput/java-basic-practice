package SimpleConditions;
import java.util.Scanner;
public class temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        int temp = sc.nextInt();

        if (temp>30) {
            System.out.println("The weather is hot");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("The weather is moderate");
        }
        else{
            System.out.println("The weather is cold");
        }
    
}
}
