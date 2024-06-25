package task4.thirdQ;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        // Array to store the names of the weekdays starting from Sunday at index 0
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user to enter the day position
            System.out.println("Enter the day position from 0 to 6: ");
            
            // Read the day position from the user
            int dayPosition = scanner.nextInt();
            
            // Print the corresponding weekday name
            System.out.println("The day is: " + weekdays[dayPosition]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where the user enters a position outside the valid range
            System.out.println("Invalid day index. Please enter a value between 0 and 6.");
        }
         finally {
            // Close the scanner
            scanner.close();
        }
    }
}