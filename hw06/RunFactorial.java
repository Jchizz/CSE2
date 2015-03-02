// Jonathan Chisholm
// 3/3/2015
// CSE 002
//Homework 06 - Run Factorial

// In this lab, my program will:
// -Get an integer that is between 9 and 16, inclusively
// -Run the factorial for that integer using a while loop

// Import the scanner
import java.util.Scanner;

// Set the class
public class RunFactorial {
    // Main method required for every java program
    public static void main (String [] args) {
        
        // Declare the input
        int input;
        // Declare the factorial variable
        int factorial = 1;
        
        // Prompt the user for the input
        System.out.println("Please enter an integer that is between 9 and 16");
        
        // Check to see if the user used a correct input
        while (true) {
            // Declare the scanner and tell it to take inputs
            Scanner myScanner = new Scanner(System.in);
            // Make sure the input is an integer
            if (myScanner.hasNextInt()) {
                input = myScanner.nextInt();
                // Make sure the integer is between 9 and 16, inclusive
                if (input < 9 || input > 16) {
                    System.out.println("Invalid input, enter again");
                }
                else {
                    // Break out of the loop and continue the program
                    System.out.println("Input accepted:");
                    break;
                }
            }
            else {
                    System.out.println("Invalid input, enter again");
            }
        }
        
        // Declare and initialize a variable that can be manipulated without losing the inital input
        int factorialMultiplier = input;
        
        // Calculate the factorial of the input
        while (factorialMultiplier > 0) {
            // Multiply the current factorial value by the factorial multiplier
            factorial *= factorialMultiplier;
            // Decrease the factorial multiplier by 1
            factorialMultiplier--;
        }
        // Display the factorial
        System.out.println(input+"!= "+factorial);
    }
}