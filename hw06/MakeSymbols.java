// Jonathan Chisholm
// 3/3/2015
// CSE 002
//Homework 06 - Make Symbols

// In this lab, my program will:
// -Generate a random integer between 0 and 100
// -Determine whether the integer is an even or odd number
// -For even numbers, print out that number of "*" characters
// -For odd numbers, print out that number of "&" characters

// Import the Math function
import java.lang.Math;

// Set the class
public class MakeSymbols {
    // Main method required for every java program
    public static void main (String [] args) {
    
        // Declare and initialize the input
        int input = (int)(Math.random()*101);
        
        // Declare the symbol strng
        String symbols = "";
        
        // Determine whether the input is even or odd
        if (input %2 == 0) {
            // While the input is even:
            do {
                // Add the symbol for that input number
                symbols += "*";
                // Lower the input value by one until the number of *'s is equal to the input
                input--;
            } while (input > 0);
        }
        else {
            // While the input is odd:
            do {
                symbols += "&";
                // Lower the input value by one until the number of *'s is equal to the input
                input--;
            } while (input > 0);
        }
        // Print the string of symbols
        System.out.println(symbols);
    }
}