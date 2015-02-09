// Jonathan Chisholm
// 2/10/2015
// CSE 002
// Homework 3 - Root

// In this homework, my program will:
// -Obtain a number as a double
// -Estimate the cubed root of that double
// -Improve the estimate five times
// -Print out the final estimate

// Import the scanner
import java.util.Scanner;

public class Root {
    // main method required for every java program
    public static void main(String[] args) {
        
        // Declare the scanner
        Scanner myScanner;
        // Tell the scanner to take inputs
        myScanner = new Scanner(System.in);
        // Prompt user for the number
        System.out.print("Enter a double, and I print it's cube root: ");
        // Accept the input and store it as a variable
        double val = myScanner.nextDouble();
        
        // Make the first estimate
        double guess1;
        guess1 = val/3;
        
        // Make the second estimate
        double guess2;
        guess2 = (2*guess1*guess1*guess1+val)/(3*guess1*guess1);
        
        // Make the third estimate
        double guess3;
        guess3 = (2*guess2*guess2*guess2+val)/(3*guess2*guess2);
        
        // Make the fourth estimate
        double guess4;
        guess4 = (2*guess3*guess3*guess3+val)/(3*guess3*guess3);
        
        // Make the fifth estimate
        double guess5;
        guess5 = (2*guess4*guess4*guess4+val)/(3*guess4*guess4);
        
        // Make the final estimate
        double guessFinal;
        guessFinal = (2*guess5*guess5*guess5+val)/(3*guess5*guess5);
        
        // Print the final estimate
        System.out.println("The cube root is " + guessFinal + ":");
        System.out.println(guessFinal + "*" + guessFinal + "*" + guessFinal + " = " + (guessFinal*guessFinal*guessFinal));
    }
}