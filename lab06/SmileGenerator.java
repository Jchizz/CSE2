// Jonathan Chisholm
// 2/20/2015
// CSE 002
// Lab 06 - Smile Generator

// In this lab, my program will:
// -Print out 5 smiley faces using a non-nested for loop, then a while loop, then a do-while loop
// -Print out a random number of smiley faces between 0 and 100
// -Print out a random number of smiley faces between 0 and 100 with no more than 30 on one line
// -Print out smiley faces equal to what number line it is

// Import the Math function
import java.lang.Math;

// Set the class
public class SmileGenerator {
    // Main method required for every java program
    public static void main (String [] args) {
        
        // Declare the count variable
        int count = 1;
        
        // Step 1
        // Run the loop 5 times, increasing the count by 1 each time
        for (; count < 6; count++) {
            System.out.print(":) ");
        }
        // Move to a new line once all the smiley faces are printed
        System.out.println(" ");
        // Reset the counter
        count = 1;
        
        // Run the loop 5 times with a while loop
        while (count < 6) {
            System.out.print(":) ");
            count++;
        }
        // Move to a new line once all the smiley faces are printed
        System.out.println(" ");
        // Reset the counter
        count = 1;
        
        // Run the look 5 times with a do-while loop
        // The loop will run automatically the first time, so it only needs to run 4 more times
        do {
            System.out.print(":) ");
            count++;
        } while (count < 6);
        
        // Move to a new line once all the smiley faces are printed
        System.out.println(" ");
        // Reset the counter
        count = 1;
        
        // Step 2
        // Set the count to a random number
        count = (int)(Math.random()*100) + 1;
        
        // Print the smiley faces with a 4 loop
        // The loop will not print more than 100 times
        for (; count <=100; count++) {
           System.out.print(":) ");
        }
        
        // Move to a new line once all the smiley faces are printed
        System.out.println(" ");
        
        // Step 3
        // Reset the count to a random number again
        count = (int)(Math.random()*100) + 1;
        // Set a count check to check if there are 30 smiley faces on a line
        int countCheck = count;
        
        // Do the same thing as the previous loop
        for (; count <=100; count++) {
           // For every 30 smiley faces, make a new line
           // This will ensure that it will print a new face every 30 lines, not every time count is 30
           if (count == (countCheck+30) || count == (countCheck+60) || count == (countCheck+90)) {
               System.out.println(" ");
           }
           System.out.print(":) ");
        }
        
        // Move to a new line once all the smiley faces are printed
        System.out.println(" ");
        
        // Step 4
        // Set the count to a random number
        count = (int)(Math.random()*100) + 1;
        // Declare a string to use for the smileys
        String smiley = ":)";
        
        // Run the loop, capping it at 100 smileys per line
        for (; count <= 100; count++) {
            System.out.println(smiley);
            // Add a new smiley to the end of the line
            smiley += " :)";
        }
    }
}