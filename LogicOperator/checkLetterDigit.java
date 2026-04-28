package LogicOperator;
import java.util.*;;

public class checkLetterDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter a character: ");
       
        char ch = sc.next().charAt(0);

        // Check type
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }
    }
    
}
