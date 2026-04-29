package LogicOperator;

import java.util.Scanner;


public class passwordCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a password: ");
        String password = sc.nextLine();
        
        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
        
    }
    
    public static boolean isValidPassword(String password) {
        // Rule 1: Length ≥ 8
        if (password.length() < 8) {
            return false;
        }
        
        // Rule 2: Contains at least one digit
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }
        
        return hasDigit;
    }
}
