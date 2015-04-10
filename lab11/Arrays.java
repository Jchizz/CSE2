// Jonathan Chisholm
// 4/10/2015
// CSE 002
// Lab 11 - Array Searching

// Import the random number generator
import java.util.Random;
// Import the scanner
import java.util.Scanner;

// Set the class and main method
public class Arrays{
public static void main(String [] arg){
      
    // Declare the arrays
    int array1[] = new int[100];
    int array2[] = new int[100];
      
    // Fill the first array with random integers between 0 and 100
    // Declare and initialize the random number generator
    Random randomGenerator = new Random();
    // Loop through the random number generator until 100 numbers are generated
    for (int i = 0; i < 100; i++) {
          // Generate the random number
          int randomInt1 = randomGenerator.nextInt(100);
          // Add the number to the array
          array1[i] = randomInt1;
    }
      
    // Find the minimum and maximum of array1
    // Declare and initialize the minimum and maximum variables
    int min1 = array1[0];
    int max1 = array1[0];
    // Run through a for loop to check all 100 integers in the array
    for (int i = 0; i < 100; i++) {
        // Check to see if the value is greater than the current max
        if (array1[i] > max1) {
            // Set the new maximum
            max1 = array1[i];
        }
        // Check to see if the value is less than the current min
        if (array1[i] < min1) {
            // Set the new minimum
            min1 = array1[i];
        }
    }
    // Print out the minimum and maximum
    System.out.println("The maxiumum of array1 is: "+max1);
    System.out.println("The minimum of array1 is: "+min1);
    
    // Fill the second array with random increasing integers
    // Declare the random variable for array 2
    int randomInt2;
    // Loop through the random number generator until 100 numbers are generated
    for (int i = 0; i < 50; i++) {
        // Set the initial value using an if statement
        if (i == 0) {
             // Generate the random number
            randomInt2 = randomGenerator.nextInt(50);
            // Add the number to the array
            array2[i] = randomInt2; 
        }
        // Otherwise, add the new number to the previous array value
        else {
            // Generate the random number
            randomInt2 = randomGenerator.nextInt(50);
            // Add the number to the array
        array2[i] = array2[i-1] + randomInt2;
        }
    }
    
    // Find the minimum and maximum of array2
    // Declare and initialize the minimum and maximum variables
    int min2 = array2[0];
    int max2 = array2[0];
    // Run through a for loop to check all 100 integers in the array
    for (int i = 0; i < 50; i++) {
        // Check to see if the value is greater than the current max
        if (array2[i] > max2) {
            // Set the new maximum
            max2 = array2[i];
        }
        // Check to see if the value is less than the current min
        if (array2[i] < min2) {
            // Set the new minimum
            min2 = array2[i];
        }
    }
    // Print out the minimum and maximum
    System.out.println("The maxiumum of array1 is: "+max2);
    System.out.println("The minimum of array1 is: "+min2);
    
    // Declare the scanner
    Scanner scan = new Scanner(System.in);
    // Prompt the user to enter an int
    System.out.print("Enter an int: ");
    // Declare a target variable
    int target;
    // Check to make sure the input is an int
    if (!scan.hasNextInt()) {
        System.out.println("You did not enter an int");
        // Exit the program
        return;
    }
    // If the input is an int, continue
    else {
        target = scan.nextInt();
    }
    // Check to make sure the int is positive
    if (target <= 0) {
        System.out.println("You did not enter an int > 0");
        // Exit the program
        return;
    }
    
    // Declare variables for an index and a variable to store the found value in
    int indexLow = 0;
    int indexHigh = (array2.length - 1);
    int average = 0;
    // This will be changed to true if the target number was found
    boolean found = false;
    // Loop the array to search for the number
    while (indexLow < indexHigh) {
        // Go to the middle of the remaining array
        average = (indexHigh + indexLow)/2;
        // Using if statements, adjust the range that you must check
        if (array2[average] < target) {
            indexHigh = average - 1;
        }
        else if (array2[average] > target) {
            indexLow = average + 1;
        }
        // If the target value is found, print it out
        else {
        System.out.println(target+" was found at array2["+average+"]");
        found = true;
        }
    }
    // If the target value is not found, print out the numbers above and below it in the array
    if (!found) {
        System.out.println(target+" was not found in the list");
        System.out.println("The number below the key was "+array2[average + 1]);
        System.out.println("The number above the key was "+array2[average - 1]);
    }
}
}