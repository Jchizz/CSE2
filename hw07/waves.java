// Jonathan Chisholm
// 2/20/2015
// CSE 002
// HW 07 - Zigzag

// In this lab, my program will:
// -Get a number between 1 and 30 from the user
// -Print out a wave made from numbers
// -Even numbers will increase as they go along (i.e. the wave will go up)
// -Odd numbers will decrease as they go along

// Import the scanner
import java.util.Scanner;

// Set the class
public class waves {
    // Main method required for every java program
    public static void main (String [] args) {
        
        // Declare and initialize the scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Declare and intiialize the number value so the while loop will run
        // Make sure the initial value is an integer but outside the proper range
        int number = -1;
        
        // Declare the string that will be printed
        String waveChar;
        
        // Prompt the user for a number
        System.out.print("Enter a number between 1 and 30: ");
        while (number < 1 || number > 30) {
            // If the input is not an int, print an error message
            while (!myScanner.hasNextInt()) {
            System.out.println("Improper input");
            // Clear the scanner
            myScanner.next();
            }
            number = myScanner.nextInt();
            // If the input is in the correct range, break out of the loop
            if (number >= 1 && number <= 30) {
                break;
            }
            else {
                System.out.println("Improper input");
            }
        }
        
        // New line again to space out the waves
        System.out.println("");
        
        // Run the for loop wave as a for loop
        System.out.println("FOR LOOP:");
        // Run the loop (i.e. each rise or fall of the wave) the amount of times equal to the input
        for (int waveCount = 1; waveCount <= number; waveCount++) {
            // Going up on even waves:
            if (waveCount%2 == 0) {
                // Initialize/reset the string to be printed
                waveChar = "";
                for (int charCount = 1; charCount <= waveCount; charCount++) {
                    // Add a new character to the string
                    waveChar += waveCount;
                    // Print out the string and move to the next line
                    System.out.println(waveChar);
                }
            }
            // Going down on odd waves:
            else {
                // The purpose of this loop is merely to move to a new line once the inner loop is finished running
                for (int charCount = waveCount; charCount >= 1; charCount--) {
                    // For each line of the wave, add that many waveChars before moving to a new line
                    for (int length = 1; length <= charCount; length++) {
                        // Print out the number
                        System.out.print(waveCount);
                    }
                    // Move to a new line once all chars have been printed
                    System.out.println("");
                }
            }
        }
        
        // New line again to space out the waves
        System.out.println("");
        
        // Run the loop wave as a while loop
        System.out.println("WHILE LOOP:");
        // Declare and initialize the wave count for this loop
        int waveCount = 1;
        // Run the loop for the amount of times equal to the input
        while (waveCount <= number) {
            // Going up on even waves:
            if (waveCount%2 == 0) {
                // Initialize/reset the string to be printed
                waveChar = "";
                // Initialize your character counter
                int charCount = 1;
                while (charCount <= waveCount) {
                    // Add a new character to the string
                    waveChar += waveCount;
                    // Print out the string and move to the next line
                    System.out.println(waveChar);
                    // Increase the charCount
                    charCount++;
                }
            }
            // Going down on odd waves:
            else {
                // Initialize your character counter
                int charCount = waveCount;
                // The purpose of this loop is merely to move to a new line once the inner loop is finished running
                while (charCount >= 1) {
                    // Initialize your length variable
                    int length = 1;
                    // For each line of the wave, at that many waveChars before moving to a new line
                    while (length <= charCount) {
                        // Print out the number for each time the loop runs
                        System.out.print(waveCount);
                        // Increase the length variable
                        length++;
                    }
                    // Move to a new line once all the chars have been printed
                    System.out.println("");
                    // Decrease the character count by 1
                    charCount--;
                }
            }
            // Increase the waveCount
            waveCount++;
        }
        
        // New line again to space out the waves
        System.out.println("");
        
        // Run the loop wave as a while loop
        System.out.println("DO-WHILE LOOP:");
        // Declare and initialize the wave count for this loop
        waveCount = 1;
        // Run the loop for the amount of times equal to the input
        do {
            // Going up on even waves:
            if (waveCount%2 == 0) {
                // Initialize/reset the string to be printed
                waveChar = "";
                // Initialize your character counter
                int charCount = 1;
                do {
                    // Add a new character to the string
                    waveChar += waveCount;
                    // Print out the string and move to the next line
                    System.out.println(waveChar);
                    // Increase the charCount
                    charCount++;
                } while (charCount <= (waveCount));
            }
            // Going down on odd waves:
            else {
                // Initialize your character counter
                int charCount = waveCount;
                // The purpose of this loop is merely to move to a new line once the inner loop is finished running
                do {
                    // Initialize your length variable
                    int length = 1;
                    // For each line of the wave, at that many waveChars before moving to a new line
                    do {
                        // Print out the number for each time the loop runs
                        System.out.print(waveCount);
                        // Increase the length variable
                        length++;
                    } while (length <= (charCount));
                    // Move to a new line once all the chars have been printed
                    System.out.println("");
                    // Decrease the character count by 1
                    charCount--;
                } while (charCount >= 1);
            }
            // Increase the waveCount
            waveCount++;
        } while (waveCount <= (number));
    }
}

        