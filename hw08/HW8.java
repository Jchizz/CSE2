// Jonathan Chisholm
// 3/24/2015
// CSE 002
// Homework 08 - MG's Adventure World

// In this lab, my program will:
// -Use a series of methods to create scenarios experienced in a game
// -Include a main method which runs the game itself

// Import the scanner
import java.util.Scanner;

// Import the math class
import java.lang.Math;

// Set the class
public class HW8 {
    
    // The method for the giant artwork
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }


    // The method for the cave artwork
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *         ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }

    // The method for the boxes artwork
    public static void box() {
        System.out.println("                     *********************     *********************    *********************              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************              "); 
    }

    // The method for continuing the game
    public static String getInput(Scanner scan, String string) {
        // Get the user's input
        String confirm = "";
        confirm = scan.next();
        // If the user inputs "c" or "C", the program continues
        if (confirm.equals("C")  || confirm.equals("c")) {
        return string;
        }
        // If not, the program exits
        else {
            System.out.println("Yea right LOSER!");
            System.exit(1);
        }
        return string;
    }
    
    // The method for the battle with the giant
    public static String getInput(Scanner scan, String string, int trial) {
        // Declare and initialize the hit counter
        int hits = 0;
        // Run the following loop until the giant has been hit ten times
        while (hits < trial) {
            // Get the user's input
            String action = "";
            action = scan.next();
            // If the user attacks:
            if (action.equals("A")  || action.equals("a")) {
                // Determine if the user hits or misses
                int toHit = (int)(Math.random()*11);
                // Tell the user they hit
                if (toHit >=5) {
                    System.out.println("Critical hit!");
                    // Increase the hits counter
                    hits++;
                }
                // Tell the user they missed
                else {
                    System.out.println("Gosh! How can you miss it!");
                }
            } 
            // If the user tries to flee:
            if (action.equals("E")  || action.equals("e")) {
                 // Determine if the user successfully flees
                int toFlee = (int)(Math.random()*11);
                // If the user succeeds:
                if (toFlee == 10) {
                    System.out.println("You escaped successfully!");
                    break;
                }
                // If the user fails:
                else {
                    System.out.println("You failed to escape.");
                }
            }
            // If the user yields:
            if (!action.equals("A") && !action.equals("a") && !action.equals("E") && !action.equals("e")) {
                System.out.println("Executed by the GIANT! Game over!");
                // Exit the program
                System.exit(1);
            }
            // Remind the user what to do
            while (hits < trials) {
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            }
        }
        return string;
    }
    
    // The method for choosing the treasury box
    public static String getInput(Scanner scan) {
        int box = scan.nextInt(); 
        // Use switch statements to determine the reward
        switch (box) {
        // Inside of box 1:
        case 1:
            System.out.print("You get a 4.00 GPA ");
            break;
        // Inside of box 2:
        case 2:
            System.out.print("You get some fleek new Raybands ");
            break;
        case 3:
            System.out.print("You get a rock ");
            break;
        // If the user chooses an incorrect number:
        default:
            System.out.println("A wrong number! You get nothing!");
            System.exit(1);
            break;
        }
        String string = "gg";
        return string;
    }
    
    // The main mehtod, which contains the actual game
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
}
