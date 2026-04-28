package BasicLooping;

public class productNumber {
    
    public static void main(String[] args) {
        int n=234;
        int product =1;
        int temp=n;

        while (temp>0) {
            int digit= temp%10;
            product *= digit;
            temp /= 10;
        }
        System.out.println(product);
    }
}
