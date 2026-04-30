package NumberbasedLoop;

public class armStrongNumber {

    public static void main(String[] args) {
        
        int digit=153;
        int num1=digit;
        int result=0;

        while (digit>0) {
            int temp=digit%10; // 3
            result= result+( temp * temp *temp); //;
            digit/=10;
            
        }

      if (result == num1) {

        System.out.println("ArmStrong number");
      }
      else {
        System.out.println("Not armstrong number");
      }
    }
    
}
