package BasicArray;

import java.util.Scanner;

public class findindmaxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        System.out.println("Index of maximum element: " + max);
        System.out.println("Index of minimum element: " + min);
    }
}
