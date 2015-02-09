// Jonathan Chisholm
// 2/10/2015
// CSE 002
// Homework 3 - Bicycle

// In this homework, my program will:
// -Obtain the number of seconds on the trip
// -Obtain the number of front wheel rotations
// -Calculate and display the distance of the trip
// -Calculate and display the time in minutes
// -Calculate and display the average miles per hour

// Import the scanner
import java.util.Scanner;

public class Bicycle {
    // main method required for every java program
    public static void main(String[] args) {
        
        // Declare the scanner
        Scanner myScanner;
        // Tell the scanner to take inputs
        myScanner = new Scanner(System.in);
        
        // Prompt user for the number of seconds
        System.out.print("Enter the number of seconds: ");
        // Accept the input and store it as a variable
        int secs = myScanner.nextInt();
        // Prompt user for the number of counts
        System.out.print("Enter the number of counts: ");
        // Accept the input and store it as a variable
        int counts = myScanner.nextInt();
        
        // our intermediate variables and output data
        double wheelDiameter = 27.0, // Diameter of the front wheel
        PI = 3.14159, // Rough estimate of pi
        feetPerMile = 5280, // Number of feet in a mile
        inchesPerFoot = 12, // Number of inches in a foot
        secondsPerMinute = 60; // Number of seconds in a minute
        double distance, minutes, mph; // Variables to be determined after calculations
        

        // Calculate the distance for the trip
        distance = counts * wheelDiameter * PI; // Gives the distance in inches
        // (for each count, a rotation of the wheel travels the diameter in inches times pi)
        distance /= inchesPerFoot*feetPerMile; // Gives the distance in miles
        // Calculate the number of minutes
        minutes = secs/secondsPerMinute;
        // Calculate the mph
        mph = distance/(minutes/60); // 60 minutes in an hour
        
        // Truncate the results
        int distanceInt, minutesInt, mphInt;
        distanceInt = (int) (distance*100);
        minutesInt = (int) (minutes*100);
        mphInt = (int) (mph*100);
        System.out.println(distanceInt);
        System.out.println(minutesInt);
        System.out.println(mphInt);
        double distanceFinal, minutesFinal, mphFinal;
        distanceFinal = ((double) distanceInt)/100;
        minutesFinal = ((double) minutesInt)/100;
        mphFinal = ((double) mphInt)/100;
        
        // Print out the output data.
        System.out.println("The distance was " + distanceFinal + " miles and it took " + minutesFinal + " minutes.");
        System.out.println("The average mph was " + mphFinal);
        
    }  // end of main method
}  // end of class