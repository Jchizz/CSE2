// Jonathan Chisholm
// 2/20/2015
// CSE 002
// Lab 07 - Zigzag

// In this lab, my program will:
// -Print out 10 stars ('*') on a line
// -Print out a diagonal line of 10 stars
// -Get an input between 3 and 33 and print that many stars on a line, then a diagonal line, then another line
// -Ask the user if he or she wants to leave the program

// Import the scanner
import java.util.Scanner;

// Set the class
public class zigzag {
    // Main method required for every java program
    public static void main (String [] args) {
        
        do {
            // Declare and initialize the scanner
            Scanner myScanner = new Scanner(System.in);
        
            // Declare and initialize the number of stars variable
            int nStars = -1;
            // Declare and initialize the star counter
            int starCount = 0;
            
            // Promt the user for the input
            System.out.print("Enter an int between 3 and 33: ");
            while (nStars < 3 || nStars > 33) {
                // If the input is not an int, pritn an error message
                while (!myScanner.hasNextInt()) {
                System.out.println("Improper input");
                // Clear the scanner
                myScanner.next();
                }
                nStars = myScanner.nextInt();
                // If the input is in the correct range, break out of the loop
                if (nStars > 3 && nStars < 33) {
                    break;
                }
            }
                
                // Move to the next line
                System.out.println(' ');
                // Print out the stars in a line
                for (; starCount < nStars; starCount++) {
                    System.out.print('*');
                }
                // Move to the next line
                System.out.println(' ');
                
                // Print out the stars in a diagonal line
                for (int lineCount = 0; lineCount < (starCount-2); lineCount++) {
                    // Create a counter for the number of spaces
                    for (int spaceCount = 0; spaceCount < (lineCount+1); spaceCount++){
                    System.out.print(' ');
                    }
                    System.out.println('*');
                }
            
                // Reset the star count to 0
                starCount = 0;
                
                // Print out the stars in a line again
                for (; starCount < nStars; starCount++) {
                    System.out.print('*');
                }
                
                // Move to the next line
                System.out.println(' ');
                // Ask the user if they want to run the program again
                System.out.print("Enter y or Y to go again: ");
                // Create a string variable to be used for the confirmation
                String confirm = "";
                confirm = myScanner.next();
                // Check if the user responded with a "y" or "Y" for yes
                if (!confirm.equals("y")  && !confirm.equals("Y")) {
                    break;
                }
        } while (true);
    }
}