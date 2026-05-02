package LogicalLoopCombination;

import java.util.Scanner;

public class sumofevendigit {

    public static int sumOfDigit(int num){
        int sum=0;
        while (num>0) {
            int temp= num%10;
            sum+=temp;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        for (int i = 1; i <=100; i++) {
            if (sumOfDigit(i)%2==0) {
                System.out.print(i+" ");
            }
        }


    }
    
}
