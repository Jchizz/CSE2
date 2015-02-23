// Jonathan Chisholm
// 2/24/2015
// CSE 002
// Homework 5 - Decimal to Hexadecimal Converter

// In this lab, my program will:
// -Obtain RGB values from the user
// -Convert the RBG values to hexidecimal numbers
// -Display the new hexidecimal RGB values to the user

// Import the scanner
import java.util.Scanner;

public class ToHex {
    public static void main (String[] args) {
        
        // Declare the scanner and tell it to take inputs
        Scanner myScanner = new Scanner(System.in);
        
        // Declare and initialize the RGB values via the user's inputs
        int red, green, blue;
        // Check to see that the values are integers between 0 and 255
        System.out.println("Please enter three numbers representing RGB values:");
        if (myScanner.hasNextInt()) {
            red = myScanner.nextInt();
            if (red > 255) {
                System.out.println("Sorry, you must enter values between 0-255.");
                return;
            }
        }
        else {
            System.out.println("Sorry, your input must consist of integers.");
            return; // Leaves the program/the program terminates
        }
        if (myScanner.hasNextInt()) {
            green = myScanner.nextInt();
            if (green > 255) {
                System.out.println("Sorry, you must enter values between 0-255.");
                return;
            }
        }
        else {
            System.out.println("Sorry, your input must consist of integers.");
            return;
        }
        if (myScanner.hasNextInt()) {
            blue = myScanner.nextInt();
            if (blue > 255) {
                System.out.println("Sorry, you must enter values between 0-255.");
                return;
            }
        }
        else {
            System.out.println("Sorry, your input must consist of integers.");
            return;
        }
        
        // Convert the values to a hexadecimal format
        // First, initialize the new values
        int hexRed1, hexRed2, hexGreen1, hexGreen2, hexBlue1, hexBlue2;
        // Next, calculate the first digit by dividing the input value by 16
        // Make sure to truncate it by making the new value an integer
        hexRed1 = (int) (red/16);
        hexGreen1 = (int) (green/16);
        hexBlue1 = (int) (blue/16);
        // Third, calculate the second digit via the mod function in order to find the remainder
        hexRed2 = red%16;
        hexGreen2 = green%16;
        hexBlue2 = blue%16;
        // Lastly, convert the double digit values into letters the new values into strings
        String RRGGBB = "";
        switch (hexRed1) {
            case 10:
                RRGGBB += "A";
                break;
            case 11:
                RRGGBB += "B";
                break;
            case 12:
                RRGGBB += "C";
                break;
            case 13:
                RRGGBB += "D";
                break;
            case 14:
                RRGGBB += "E";
                break;
            case 15:
                RRGGBB += "F";
                break;
            default:
                RRGGBB += hexRed1;
                break;
        }
        switch (hexRed2) {
            case 10:
                RRGGBB += "A";
                break;
            case 11:
                RRGGBB += "B";
                break;
            case 12:
                RRGGBB += "C";
                break;
            case 13:
                RRGGBB += "D";
                break;
            case 14:
                RRGGBB += "E";
                break;
            case 15:
                RRGGBB += "F";
                break;    
            default:
                RRGGBB += hexRed2;
                break;
        }
        switch (hexGreen1) {
            case 10:
                RRGGBB += "A";
                break;
            case 11:
                RRGGBB += "B";
                break;
            case 12:
                RRGGBB += "C";
                break;
            case 13:
                RRGGBB += "D";
                break;
            case 14:
                RRGGBB += "E";
                break;
            case 15:
                RRGGBB += "F";
                break;
            default:
                RRGGBB += hexGreen1;
                break;
        }
        switch (hexGreen2) {
            case 10:
                RRGGBB += "A";
                break;
            case 11:
                RRGGBB += "B";
                break;
            case 12:
                RRGGBB += "C";
                break;
            case 13:
                RRGGBB += "D";
                break;
            case 14:
                RRGGBB += "E";
                break;
            case 15:
                RRGGBB += "F";
                break;    
            default:
                RRGGBB += hexGreen2;
                break;
        }
        switch (hexBlue1) {
            case 10:
                RRGGBB += "A";
                break;
            case 11:
                RRGGBB += "B";
                break;
            case 12:
                RRGGBB += "C";
                break;
            case 13:
                RRGGBB += "D";
                break;
            case 14:
                RRGGBB += "E";
                break;
            case 15:
                RRGGBB += "F";
                break;    
            default:
                RRGGBB += hexBlue1;
                break;
        }
        switch (hexBlue2) {
            case 10:
                RRGGBB += "A";
                break;
            case 11:
                RRGGBB += "B";
                break;
            case 12:
                RRGGBB += "C";
                break;
            case 13:
                RRGGBB += "D";
                break;
            case 14:
                RRGGBB += "E";
                break;
            case 15:
                RRGGBB += "F";
                break;
            default:
                RRGGBB += hexBlue2;
                break;
        }
        // Return the new output to the user
        System.out.println("The decimal numbers R:"+red+", G:"+green+", B:"+blue+", is represented in hexadecimal as: "+RRGGBB);
    }
}