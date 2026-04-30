package NumberbasedLoop;

public class reverseDigit {

    public static void main(String[] args) {
        
        int digit=1234;
        int reverse=0;

        while (digit>0) {

            int temp=digit%10;
            digit /=10;
            reverse=reverse*10+temp;
            
        }
        System.out.println(reverse);
    }
    
}
