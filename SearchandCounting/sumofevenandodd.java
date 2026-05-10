package SearchandCounting;
import java.util.Scanner;

public class sumofevenandodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        inputArray.inputArray(arr);
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
    }
        System.out.println("Sum of even elements: " + evenSum);
        System.out.println("Sum of odd elements: " + oddSum);
    }
}
