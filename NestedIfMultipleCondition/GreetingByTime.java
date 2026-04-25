package NestedIfMultipleCondition;

import java.util.Scanner;

public class GreetingByTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hour of the day (0–23): ");
        int hour = sc.nextInt();

        if (hour >= 0 && hour <= 11) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour <= 16) {
            System.out.println("Good Afternoon");
        } else if (hour >= 17 && hour <= 20) {
            System.out.println("Good Evening");
        } else if (hour >= 21 && hour <= 23) {
            System.out.println("Good Night");
        } else {
            System.out.println("Invalid hour! Please enter a value between 0 and 23.");
        }

        sc.close();
    }
}

