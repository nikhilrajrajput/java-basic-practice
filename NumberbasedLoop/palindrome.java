package NumberbasedLoop;

public class palindrome {
    
    public static void main(String[] args) {
        int digit=1212;
        int num2=digit;
        int reverse=0;

        while (digit>0) {
            int temp=digit%10;
            digit=digit/10;
            reverse=reverse*10+temp;
            
        }
        if (reverse==num2) {
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("It is not palindrome number");
        }
    }
}
