// Jonathan Chisholm
// 3/20/2015
// CSE 002
// Lab 08 - Factorials

// In this lab, my program will:
// -Get an input from the user
// -Print out the super factorial
// -Call upon specific methods to calculate each factorial

// Import the scanner
import java.util.Scanner;

// Set the class
public class Factorials {
    
    // Create the factorial method
    public static int factorial(int input) {
        
        // Declare and initialize the multiple variable
        int multiple = 1;
        
        // Cause the loop to run a number of times equal to the input
        for (int i = 1; i <= input; i++) {
            // For each loop, multiply the factorial by that number loop
            multiple *= i;
        }
        
        // Return the end result for use outside the mehtod
        return multiple;
    }
    
    // Create the print method
    public static void print (int input, int sum) {
        
        System.out.println("The super factorial of "+input+" is "+sum);
        
    }
    
    // Main method required for every java program
    public static void main (String [] args) {
        
        // Declare and initialize the scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Get the input
        // First, initialize the input value so the confirmation loop can run
        int value = -1;
        // Affirm that the input is a valid integer
        while (value < 3 || value > 33) {
            // If the input is not an int, pritn an error message
            if (!myScanner.hasNextInt()) {
                System.out.println("Improper input");
                // Clear the scanner
                myScanner.next();
            }
                // If the input is in the correct range, break out of the loop
            else {
                value = myScanner.nextInt();
                break;
            }
        }
        
        // Declare and initialize the sum value, which will be changed later
        int sum =0;
        
        // Get the super factorial by running a loop using the factorial method
        for (int i = 1; i <= value; i++) {
            // Add the result of the factorial method to the sum
            sum += factorial(i);
        }
        
        // Print the super factorial
        print(value, sum);
        
    }
}