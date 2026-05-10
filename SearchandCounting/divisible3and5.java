package SearchandCounting;

import java.util.Scanner;

public class divisible3and5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray.inputArray(arr);
        int thirdDiv=0;
        int fifthDiv=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0) {
                thirdDiv++;
            }
            if (arr[i]%5==0) {
                fifthDiv++;
            }
        }
        System.out.println("Sum of elements divisible by 3: " + thirdDiv);
        System.out.println("Sum of elements divisible by 5: " + fifthDiv);
    }
    
}
