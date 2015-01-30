// Jonathan Chisholm
// 1/30/2015
// CSE 002
// Lab 2 - Cyclometer

// In this lab, my program will:
// -Print the number of minutes for each trip
// -Print the number of front wheel rotations for each trip
// -Print the distance of each trip in miles
// -Print the distance for the two trips combined

// Document your program. What does MPG do? Place your comments here!
//
public class Cyclometer {
    // main method required for every java program
    public static void main(String[] args) {
        
        // our input data
        int secsTrip1 = 480; // Time in seconds of the first trip
        int secsTrip2 = 3220;  // Time in seconds of the second trip
        int countsTrip1 = 1561;  // Number of front wheel rotations in the first trip
        int countsTrip2 = 9037;  // Number of front wheel rotations in the second trip
        
        // our intermediate variables and output data
        double wheelDiameter = 27.0, // Diameter of the front wheel
        PI = 3.14159, // Rough estimate of pi
        feetPerMile = 5280, // Number of feet in a mile
        inchesPerFoot = 12, // Number of inches in a foot
        secondsPerMinute = 60; // Number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; // Variables to be determined after calculations
        
        // Print out the number of seconds and counts for each trip
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + (countsTrip1) + "counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + (countsTrip2) + "counts.");
        
        // run the calculations; store the values. Document your calculations here. What are you calculating?
        //
        //
        distanceTrip1 = countsTrip1 * wheelDiameter * PI; // Gives the distance in inches
        // (for each count, a rotation of the wheel travels the diameter in inches times pi)
        distanceTrip1 /= inchesPerFoot*feetPerMile; // Gives the distance in miles
        distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Same calculation, but on one line
        
        // Print out the output data.
        totalDistance = distanceTrip1 + distanceTrip2; // Calculate the total distance
        System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
        System.out.println("Trip 1 was " + distanceTrip2 + " miles.");
        System.out.println("The total distance was " + totalDistance + " miles.");
        
    }  // end of main method
}  // end of class