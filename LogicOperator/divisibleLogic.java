package LogicOperator;

public class divisibleLogic {

    public static void main(String[] args) {
        
        int n=15;

        if ( n%3==0 && n%5==0) {
            System.out.println("FizzBuzz");
        }
        else if(n%3==0){
            System.out.println("Fizz");
        }
        else if(n%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("Number is not divisible by 3 and 5 ");
        }
    }
    
}
