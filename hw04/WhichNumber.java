// Jonathan Chisholm
// 2/17/2015
// CSE 002
// Homework 04 - WhichNumber

// In this lab, my program will:
// -Prompt the user to think of a number between 1 and 10
// -Ask a series of questions to determine the number
// -Print out the number

// Import the scanner
import java.util.Scanner;

public class WhichNumber {
    // Main method rquired for every Java program
    public static void main(String[] args) {
 
        // Declare the scanner and tell it to take inputs
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        // Declare the variable
        char yesNo;
        
        // Prompt user to think of a number
        System.out.println("Think of a number between 1 and 10 inclusive.");
        
        // Ask the first question
        System.out.print("Is your number even? ");
        yesNo = myScanner.next().charAt(0);
        if ((yesNo == 'Y') || (yesNo == 'y')) {
            // Ask the next question
            System.out.print("Is it divisible by 3? ");
            yesNo = myScanner.next().charAt(0);
            if ((yesNo == 'Y') || (yesNo == 'y')){
                // Guess the number 6
                System.out.print("Is your number 6? ");
                yesNo = myScanner.next().charAt(0);
                if ((yesNo == 'Y') || (yesNo == 'y')) {
                    System.out.println("Yay!");
                }
                else if ((yesNo == 'N') || (yesNo == 'n')) {
                    System.out.println("A question was answered wrong. Please try again.");
                    return;
                }
                else {
                    System.out.println("Sorry, that is not a valid input.");
                return;
                }
            }
            else if ((yesNo == 'N') || (yesNo == 'n')) {
                // Ask the next question
                System.out.print("Is it divisible by 4? ");
                yesNo = myScanner.next().charAt(0);
                if ((yesNo == 'Y') || (yesNo == 'y')) {
                    // Ask the next question
                    System.out.print("Is the number divided by 4 greater than 1? ");
                    yesNo = myScanner.next().charAt(0);
                    if ((yesNo == 'Y') || (yesNo == 'y')) {
                        // Guess the number 8
                        System.out.print("Is your number 8? ");
                        yesNo = myScanner.next().charAt(0);
                        if ((yesNo == 'Y') || (yesNo == 'y')) {
                            System.out.println("Yay!");
                        }
                        else if ((yesNo == 'N') || (yesNo == 'n')) {
                            System.out.println("A question was answered wrong. Please try again.");
                            return;
                        }
                        else {
                            System.out.println("Sorry, that is not a valid input.");
                            return;
                        }
                    }
                    else if ((yesNo == 'N') || (yesNo == 'n')) {
                        // Guess the number 4
                        System.out.print("Is your number 4? ");
                        yesNo = myScanner.next().charAt(0);
                        if ((yesNo == 'Y') || (yesNo == 'y')) {
                            System.out.println("Yay!");
                        }
                        else if ((yesNo == 'N') || (yesNo == 'n')) {
                            System.out.println("A question was answered wrong. Please try again.");
                            return;
                        }
                        else {
                            System.out.println("Sorry, that is not a valid input.");
                            return;
                        }
                    }
                    else {
                        System.out.println("Sorry, that is not a valid input.");
                        return;
                    }
                }
                else if ((yesNo == 'N') || (yesNo == 'n')) {
                    // Ask the next question
                    System.out.print("Is it divisible by 5? ");
                    yesNo = myScanner.next().charAt(0);
                    if ((yesNo == 'Y') || (yesNo == 'y')) {
                        // Guess the number 10
                        System.out.print("Is your number 10? ");
                        yesNo = myScanner.next().charAt(0);
                        if ((yesNo == 'Y') || (yesNo == 'y')) {
                            System.out.println("Yay!");
                        }
                        else if ((yesNo == 'N') || (yesNo == 'n')) {
                            System.out.println("A question was answered wrong. Please try again.");
                            return;
                        }
                        else {
                            System.out.println("Sorry, that is not a valid input.");
                            return;
                        }
                    }
                    else if ((yesNo == 'N') || (yesNo == 'n')) {
                        // Guess the number 2
                        System.out.print("Is your number 2? ");
                        yesNo = myScanner.next().charAt(0);
                        if ((yesNo == 'Y') || (yesNo == 'y')) {
                            System.out.println("Yay!");
                        }
                        else if ((yesNo == 'N') || (yesNo == 'n')) {
                            System.out.println("A question was answered wrong. Please try again.");
                            return;
                        }
                        else {
                            System.out.println("Sorry, that is not a valid input.");
                            return;
                        }
                    }
                    else {
                        System.out.println("Sorry, that is not a valid input.");
                        return; 
                    }
                }
            }
            else {
                System.out.println("Sorry, that is not a valid input.");
                return;
            }
        }
        else if ((yesNo == 'N') || (yesNo == 'n')) {
            // Ask the next question
            System.out.print("Is it divisible by 3? ");
            yesNo = myScanner.next().charAt(0);
            if ((yesNo == 'Y') || (yesNo == 'y')) {
                // Ask the next question
                System.out.print("When divided by 3 is the result greater than 1?? ");
                yesNo = myScanner.next().charAt(0);
                if ((yesNo == 'Y') || (yesNo == 'y')) {
                    // Guess the number 9
                    System.out.print("Is your number 9? ");
                    yesNo = myScanner.next().charAt(0);
                    if ((yesNo == 'Y') || (yesNo == 'y')) {
                        System.out.println("Yay!");
                    }
                    else if ((yesNo == 'N') || (yesNo == 'n')) {
                        System.out.println("A question was answered wrong. Please try again.");
                        return;
                    }
                    else {
                        System.out.println("Sorry, that is not a valid input.");
                        return;
                    }  
                }
                else if ((yesNo == 'N') || (yesNo == 'n')) {
                    // Guess the number 3
                    System.out.print("Is your number 3? ");
                    yesNo = myScanner.next().charAt(0);
                    if ((yesNo == 'Y') || (yesNo == 'y')) {
                        System.out.println("Yay!");
                    }
                    else if ((yesNo == 'N') || (yesNo == 'n')) {
                        System.out.println("A question was answered wrong. Please try again.");
                        return;
                    }
                    else {
                        System.out.println("Sorry, that is not a valid input.");
                        return;
                    } 
                }
                else {
                    System.out.println("Sorry, that is not a valid input.");
                    return; 
                }
            }
            else if ((yesNo == 'N') || (yesNo == 'n')) {
                // Ask the next question
                System.out.print("Is it greater than 6? ");
                yesNo = myScanner.next().charAt(0);
                if ((yesNo == 'Y') || (yesNo == 'y')) {
                    // Guess the number 7
                    System.out.print("Is your number 7? ");
                    yesNo = myScanner.next().charAt(0);
                    if ((yesNo == 'Y') || (yesNo == 'y')) {
                        System.out.println("Yay!");
                    }
                    else if ((yesNo == 'N') || (yesNo == 'n')) {
                        System.out.println("A question was answered wrong. Please try again.");
                        return;
                    }
                    else {
                        System.out.println("Sorry, that is not a valid input.");
                        return;
                    }   
                }
                else if ((yesNo == 'N') || (yesNo == 'n')) {
                    // Ask the next question
                    System.out.print("Is it less than 3? ");
                    yesNo = myScanner.next().charAt(0);
                    if ((yesNo == 'Y') || (yesNo == 'y')) {
                        // Guess the number 1
                        System.out.print("Is your number 1? ");
                        yesNo = myScanner.next().charAt(0);
                            if ((yesNo == 'Y') || (yesNo == 'y')) {
                            System.out.println("Yay!");
                        }
                        else if ((yesNo == 'N') || (yesNo == 'n')) {
                            System.out.println("A question was answered wrong. Please try again.");
                            return;
                        }
                        else {
                            System.out.println("Sorry, that is not a valid input.");
                            return;
                        }
                    }
                    else if ((yesNo == 'N') || (yesNo == 'n')) {
                        // Guess the number 5
                        System.out.print("Is your number 5? ");
                        yesNo = myScanner.next().charAt(0);
                            if ((yesNo == 'Y') || (yesNo == 'y')) {
                            System.out.println("Yay!");
                        }
                        else if ((yesNo == 'N') || (yesNo == 'n')) {
                            System.out.println("A question was answered wrong. Please try again.");
                            return;
                        }
                        else {
                            System.out.println("Sorry, that is not a valid input.");
                            return;
                        }
                    }
                    else {
                        System.out.println("Sorry, that is not a valid input.");
                        return;
                    }
                }
                else {
                    System.out.println("Sorry, that is not a valid input.");
                    return; // Leaves the program/the prograem terminates
                }
            }
            else {
                System.out.println("Sorry, that is not a valid input.");
                return;
            }
        }
        else {
            System.out.println("Sorry, that is not a valid input.");
            return; // Leaves the program/the prograem terminates
        }
    }
}