// Jonathan Chisholm
// 3/3/2015
// CSE 002
//Homework 06 - Get Integers

// In this lab, my program will:
// -Get 5 integers from the user using a for loop
// -Sum up the integers

// Import the scanner
import java.util.Scanner;

// Set the class
public class GetIntegers {
    // Main method required for every java program
    public static void main (String [] args) {
        
        // Declare the input
        int input;
        // Declare the sum variable, which is the sum of all five inputs
        int sum = 0;
        
        // Declare the count variable
        int count = 1;
        // Prompt the user for the inputs
        System.out.println("Please enter 5 non-negative integers");
        
        
        // Run the loop 5 times, increasing the count by 1 each time
        for (; count < 6; count++) {
            // Declare the scanner and tell it to take inputs
            Scanner myScanner = new Scanner(System.in);
            // Check to see if the user input an integer
            if (myScanner.hasNextInt()) {
                // Make user the input is positive
               input = myScanner.nextInt();
                if (input <= 0) {
                    System.out.println("Invalid input, enter again");
                    // Make sure this does not count against the number of inputs
                    count--;
                }
                else {
                    // Add the input to the total sum
                    sum += input;
                }
            }
            else {
                System.out.println("Invalid input, enter again");
                // Make sure this does not count against the number of inputs
                count--;
            }
        }
        
        // One the loop is finished and all five inputs have been given, display the sum of the inputs
        System.out.println("Sum is "+sum);
    }
}