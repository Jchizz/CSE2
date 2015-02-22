// Jonathan Chisholm
// 2/20/2015
// CSE 002
// Lab 05 - Space Exploration

// In this lab, my program will:
// -Pick a year between 2000 and 2010
// -List all space exploration events that have occurred between 2000 and the chosen number

// Import the math class
import java.lang.Math;

// Set the class
public class SpaceExploration {
    // Main method required for every Java program
    public static void main (String[] args) {
     
        // Declare and initialize the year variable
        int year = (int)(Math.random()*11) + 2000;
        
        // Introduce the user to the timeline
        System.out.println("Here is a timeline of space exploration events from "+year+" to 2000:");
        
        // Create the switch statement, which holds all events
        // The program will run through the cases starting from the first one met due to the lack of a break
        switch (year) {
        case 2010:
            System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back");
        case 2009:
            System.out.println("2009: N/A");
        case 2008:
            System.out.println("2008: Kepler launched to study deep space");
        case 2007:
            System.out.println("2007: N/A");
        case 2006:
            System.out.println("2006: Spacecraft returns with collections from a comet");
        case 2005:
            System.out.println("2005: Spacecraft collides with comet");
        case 2004:
            System.out.println("2004: N/A");
        case 2003:
            System.out.println("2003: Largest infrared telescope relest");
        case 2002:
            System.out.println("2002: N/A");
        case 2001:
            System.out.println("2001: First spacecraft lands on asteroid");
        case 2000:
            System.out.println("2000: First spacecraft orbits asteroid");
            // Insert a break so that an error message will only print when necessary
            break;
        default:
            System.out.println("An error occured.");
            return;
        }
    }
}