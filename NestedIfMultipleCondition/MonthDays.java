package NestedIfMultipleCondition;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1–12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1:  // January
                System.out.println("January has 31 days.");
                break;
            case 2:  // February
                System.out.println("February has 28 days (ignoring leap years).");
                break;
            case 3:  // March
                System.out.println("March has 31 days.");
                break;
            case 4:  // April
                System.out.println("April has 30 days.");
                break;
            case 5:  // May
                System.out.println("May has 31 days.");
                break;
            case 6:  // June
                System.out.println("June has 30 days.");
                break;
            case 7:  // July
                System.out.println("July has 31 days.");
                break;
            case 8:  // August
                System.out.println("August has 31 days.");
                break;
            case 9:  // September
                System.out.println("September has 30 days.");
                break;
            case 10: // October
                System.out.println("October has 31 days.");
                break;
            case 11: // November
                System.out.println("November has 30 days.");
                break;
            case 12: // December
                System.out.println("December has 31 days.");
                break;
            default:
                System.out.println("Invalid month number! Please enter a number between 1 and 12.");
        }

        sc.close();
    }
}

