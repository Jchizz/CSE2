// Jonathan Chisholm
// 2/6/2015
// CSE 002
// Lab 03 - Big Macs

// In this homework, my program will:
// -Obtain the total number of Big Macs purchased
// -Obtain the cost per Big Mac
// -Obtain the state tax percentage
// -Calculate and print the total cost of the Big Macs, including tax

// Import the scanner
import java.util.Scanner;

public class BigMac {
    // Main method rquired for every Java program
    public static void main(String[] args) {
        
        // Declare the scanner
        Scanner myScanner;
        // Tell the scanner to take inputs
        myScanner = new Scanner(System.in);
        
        // Prompt user for the number of Big Macs
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        // Accept the input and store it as a variable
        int nBigMacs = myScanner.nextInt();
        
        // Get the cost per Big Mac
        System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        
        // Get the percent tax
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        // Change tax from percent to proportion for calculations
        taxRate/= 100;
        
        // Calculate the cost of the Big Macs
        double cost$;
        int dollars, // Whole dollar amount of cost
            dimes, pennies; // For storing digits to the right of the decimal poitn for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        // Get the whole amount, dropping decimal fraction
        dollars = (int) cost$;
        // Get dimes amount, e.g.,
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        // where the % (mod) operator returns the remainder after division: 583%100 -> 83, 27%5 -> 2
        dimes = (int) (cost$*10)%10;
        pennies = (int)(cost$*100)%10;
        System.out.println("The total cost of " + nBigMacs + " Big Macs at $" + bigMac$ + 
        " per Big Mac and a sales tax of " + (int)(taxRate*100) + "% is $" + dollars + "." + dimes + pennies);
        
    } // End of main method
} // End of class