package SearchandCounting;

import java.util.Scanner;

public class primeCount {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray.inputArray(arr);

        int primeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeCount++;
            }
        }
        System.out.println("Number of prime elements in the array: " + primeCount);
    }
    
}
