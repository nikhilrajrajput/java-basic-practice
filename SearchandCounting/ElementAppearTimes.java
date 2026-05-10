package SearchandCounting;
import java.util.Scanner;
public class ElementAppearTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray.inputArray(arr);
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("Element " + key + " appears " + count + " times in the array.");
    }

}