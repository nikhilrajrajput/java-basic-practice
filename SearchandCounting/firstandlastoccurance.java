package SearchandCounting;

import java.util.Scanner;

public class firstandlastoccurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray.inputArray(arr);
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        int first = 0;
        int last = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                first=i;
                break;
            }
        }
        for(int i= arr.length-1; i>=0; i--){
            if(arr[i]==key){
                last=i;
                break;
            }
        }

        if(first==0 && last==0){
            System.out.println("Element not found");
        }else{
            System.out.println("First occurrence of element " + key + " is at index: " + first);
            System.out.println("Last occurrence of element " + key + " is at index: " + last);
        }
    }
    
}
