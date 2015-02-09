// Jonathan Chisholm
// 2/10/2015
// CSE 002
// Homework 3 - Four Digits

// In this homework, my program will:
// -Obtain a number as a double
// -Determine the first four digits to the right of the decimal point
// -Print out the first four digits

// Import the scanner
import java.util.Scanner;

public class FourDigits {
    // main method required for every java program
    public static void main(String[] args) {
        
        // Declare the scanner
        Scanner myScanner;
        // Tell the scanner to take inputs
        myScanner = new Scanner(System.in);
        // Prompt user for the number
        System.out.println("Enter a double, and I display the four didges to the right of the decimal point: ");
        // Accept the input and store it as a variable
        double val = myScanner.nextDouble();
        
        // Convert the double to an integer
        int valInt;
        valInt = (int) (val*10000);
        
        // Gather the decimal points
        int valFinal;
        valFinal = valInt %10000; // "%10000" Divides valInt by 10000, then saves the remainder
        System.out.printf("The four digits are %04d \n", valFinal);
        
    }
}