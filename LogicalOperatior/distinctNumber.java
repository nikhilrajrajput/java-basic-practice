package LogicalOperatior;
import java.util.*;
public class distinctNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i=0;
        int arr[]= new int[3];
        while (i<=n) {
          int temp =n%10;
           System.out.println(temp);
           arr[i]=temp;
           n=n/10;
            i++;
        }

     for (int j = 1; j < arr.length; j++) {
        if(arr[j]== arr[j-1]){
            System.out.println("This number is not distinct");
            break;
        }
     }
     System.out.println("This number is distinct");
        
    }
    
}
