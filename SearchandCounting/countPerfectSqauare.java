package SearchandCounting;

import java.util.Scanner;

public class countPerfectSqauare {

    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray.inputArray(arr);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (isPerfectSquare(arr[i])) {
                count++;
            }
        }
        System.out.println("Number of perfect square elements in the array: " + count);
    }

}
