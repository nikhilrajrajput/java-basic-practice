package NumberbasedLoop;

public class countDigit {
    

    public static void main(String[] args) {
        int digit =1234654333;

        int count=0;
     
        while (digit>0) {
                count++;
                digit/=10;
               
        }
        System.out.println(count);
    }

}
