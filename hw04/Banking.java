// Jonathan Chisholm
// 2/17/2015
// CSE 002
// Homework 04 - Banking

// In this lab, my program will:
// -Begin with a random number of cash in a bank account between 1000 and 5000
// -Ask the user if they would liek to deposit money, withdraw money, or view their balance
// -If money is deposited or withdrawn, calculate and display the new balance

// Import the scanner
import java.util.Scanner;

public class Banking {
    // Main method rquired for every Java program
    public static void main(String[] args) {
 
        // Declare the scanner and tell it to take inputs
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        // Declare the variables
        int balance, endBalance, choice, deposit, withdrawl;
        
        // Get the (random) beginning balance
        balance = (int) (Math.random() * 4001) + 1000;
        
        // Ask the user which action they would like to do
        System.out.print("Press 1 to withdraw, 2 to deposit, or 3 to see your balance ");
        choice = myScanner.nextInt();
        switch (choice) {
        // Withdrawl:
        case 1:
            // Prompt the user for an amount to withdraw
            System.out.print("Enter the amount you'd like to withdraw as a positive integer: ");
            withdrawl = myScanner.nextInt();
            // Verify that the withdrawl is a positive number
            if (withdrawl > 0) {
                // Calculate the ending balance
                endBalance = balance - withdrawl;
                // Verify that the ending balance is a positive number
                if (endBalance > 0) {
                    // Display the ending balance
                    System.out.println("The resulting balance is "+endBalance);  
                }
                else {
                    System.out.println("You lack the funds for this transaction. Please try again.");
                }
            }
            else {
                System.out.println("Please enter a positive number.");
                return;
            }
            break;
        // Deposit:
        case 2:
            // Prompt the user for an amount to deposit
            System.out.print("Enter the amount you'd like to deposit as a positive integer: ");
            deposit = myScanner.nextInt();
            // Verify that the deposit is a positive number
            if (deposit > 0) {
                // Calculate the ending balance
                endBalance = balance + deposit;
                System.out.println("The resulting balance is "+endBalance);
            }
            else {
                System.out.println("Please enter a positive number.");
                return;
            }
            break;
        // Display balance:
        case 3:
            System.out.println("Your balance is "+balance);
            break;
        }
    }
}