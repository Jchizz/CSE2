// Jonathan Chisholm
// 2/13/2015
// CSE 002
// Lab 04 - Cookies

// In this lab, my program will:
// -Obtain the total number of people coming to an event
// -Obtain the total number of cookies being brought
// -Obtain the number of cookies each person should get
// -Determine whether or not you have enough cookies and if they will divide evenly

// Import the scanner
import java.util.Scanner;

public class Cookies {
    // Main method rquired for every Java program
    public static void main(String[] args) {
        
        // Declare the scanner and tell it to take inputs
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        // Declare the variables
        int people, cookies, cookiesPerPerson, remainder, shortage;
        
        // Prompt user for the number of people
        System.out.print("Enter the number of people: ");
        // Check to see if the user entered an integer
        if (myScanner.hasNextInt()) {
            people = myScanner.nextInt();
        }
        else {
            System.out.print("You did not enter an int");
            return; // Leaves the program/the program terminates
        }
        // Check to see if the user entered a positive number of people
        if (people < 1) {
            System.out.print("You did not enter an int > 0");
            return; // Leaves the program/the program terminates
        }
        
        // Prompt the user for the number of cookies
        System.out.print("Enter the number of cookies you are planning to buy: ");
        // Check to see if the user entered an integer
        if (myScanner.hasNextInt()) {
            cookies = myScanner.nextInt();
        }
        else {
            System.out.print("You did not enter an int");
            return; // Leaves the program/the program terminates
        }
        // Check to see if the user entered a positive number of cookies
        if (cookies < 1) {
            System.out.print("You did not enter an int > 0");
            return; // Leaves the program/the program terminates
        }
        
        // Promp the user for the number of cookies per person
        System.out.print("How many do you want each person to get? ");
        if (myScanner.hasNextInt()) {
            cookiesPerPerson = myScanner.nextInt();
        }
        else {
            System.out.print("You did not enter an int");
            return; // Leaves the program/the program terminates
        }
        // Check to see if the user entered a positive number of people
        if (cookiesPerPerson < 1) {
            System.out.print("You did not enter an int > 0");
            return; // Leaves the program/the program terminates
        }
        
        // Calculate the result. Are there enough cookies? Will they divide evenly?
        if ((cookies/people) >= cookiesPerPerson) {
            // Determine whether the cookies divide evenly
            remainder = (cookies/people)%cookiesPerPerson;
            if (remainder/people == 0) {
                System.out.println("You have enough cookies for each person and the amount will divide evenly.");
            }
            else {
                System.out.println("You have enough, but they will not divide evenly.");
            }
        }
        else {
            // Determine how many more cookies must be bought
            shortage = cookiesPerPerson*people - cookies;
            System.out.println("You have will not have enough cookies. You need to buy at least "+shortage+" more.");
        }
        
    } // End of main method
} // End of class