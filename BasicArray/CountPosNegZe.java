package BasicArray;

import java.util.Scanner;

public class CountPosNegZe {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                countPos++;
            } else if (arr[i] < 0) {
                countNeg++;
            } else {
                countZero++;
            }
        }
        System.out.println("Number of positive elements: " + countPos);
        System.out.println("Number of negative elements: " + countNeg);
        System.out.println("Number of zero elements: " + countZero);
    }
}
