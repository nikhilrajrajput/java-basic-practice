package SearchandCounting;

import java.util.Scanner;

public class checkUnique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        inputArray.inputArray(arr);
        boolean isUnique = true;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                isUnique=false;
                break;
            }
        }
        if(isUnique){
            System.out.println("All elements in the array are unique.");
        }else{
            System.out.println("Array contains duplicate elements.");
        }
    }
    
}
