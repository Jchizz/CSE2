// Jonathan Chisholm
// 4/14/2015
// CSE 002
// Homework 11 11 - CSE2Linear

// Import the random number generator
import java.util.Random;
// Import the scanner
import java.util.Scanner;

// Set the class
public class CSE2Linear {
  
    // Create the method for inputs
    public static int[] inputs() {
      
        // Declare the new array
        int gradesSorted[] = new int[15];
        // Declare a temporary variable to hold scanned values
        int value;
      
        // Create a loop that will get 15 inputs
        for (int i = 0; i < 15; i++) {
            // Check to see if the user used a correct input
            while (true) {
                // Declare the scanner and tell it to take inputs
                Scanner myScanner = new Scanner(System.in);
                // Make sure the input is an integer
                if (myScanner.hasNextInt()) {
                    // Store the scanned int as a value
                    value = myScanner.nextInt();
                    // Make sure the integer is between 0 and 100, inclusive
                    if (value >= 0 && value <= 100) {
                        // If no previous values have been entered, accept the value
                        if (i == 0) {
                            gradesSorted[i] = value;
                            break;
                        }
                        // Otherwise, make sure the new value is greater than the previous one
                        else {
                            if (value >= gradesSorted[i-1]) {
                                // Accept the input and break out of the while loops
                                gradesSorted[i] = value;
                                break;
                            }
                            else {
                                System.out.println("Invalid input, enter again");
                            }
                        }
                    }
                    else {
                        System.out.println("Invalid input, enter again");
                    }
                }
                else {
                    System.out.println("Invalid input, enter again");
                }
            }
        }
        // Return the array
        return gradesSorted;
    }
    
    // Create a method to print arrays
    public static void printArray(int[] array) {
        // Make a for loop that will loop through the array and print out each value
        for (int i = 0; i < 15; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
    
    // Create the binary search method
    public static void binarySearch(int[] array, int target) {
        
        // Declare variables for an index and a variable to store the found value in
        int indexLow = 0;
        int indexHigh = (array.length - 1);
        int average = 0;
        // This will be changed to true if the target number was found
        boolean found = false;
        // Declare and initialize a variable to cound the number of iterations
        int counter = 0;
        
        // Loop the array to search for the number
        while (indexLow < indexHigh) {
            // Add an interation to the counter
            counter++;
            // Go to the middle of the remaining array
            average = (int) (indexHigh + indexLow)/2;
            // Using if statements, adjust the range that you must check
            if (array[average] < target) {
                indexLow = average - 1;
            }
            else if (array[average] > target) {
                indexHigh = average + 1;
            }
            // If the target value is found, print it out
            else {
            System.out.println(target+" was found in the list with "+counter+" iterations");
            found = true;
            break;
            }
        }
        // If the target value is not found, print out the result
        if (!found) {
        System.out.println(target+" was not found in the list with "+counter+" iterations");
        }
    }
    
    // Create the random scrambling method
    public static int[] scramble(int[] array) {
        // Create a for loop that will cycle through the array
        for (int i = 0; i < 15; i++) {
            // Find a random member to swap with
            int target = (int) (array.length*Math.random());
            // Create a variable to temporarily store the first value
            int temp = array[target];
            // Replace the first value
            array[target] = array[i];
            // Replace the second value
            array[i] = temp;
        }
        return array;
    }
    
    // Create the linear search method
    public static void linearSearch(int[] array, int target) {
        // Create a variable that will determine whether the target value has been found or not
        boolean found = false;
        // Create a loop that checks the array
        for (int i = 0; i < 15; i++) {
            // Check to see if the value was found
            if (array[i] == target) {
                System.out.println(target+" was found in the list with "+(i+1)+" iterations");
                // Adjust the found variable and break out of the loop
                found = true;
                break;
            }
        }
        // If the target was not found, say so
        if (!found) {
            System.out.println(target+" was not found in the list with 15 iterations");
        }
    }
    
    public static void main(String [] arg) {
        
        // Declare the scanner and tell it to take inputs
        Scanner myScanner = new Scanner(System.in);
        
        // Prompt the user to enter the inputs
        System.out.println("Enter 15 ints for final grades in CSE2:");
        // Declare and intialize the variables for the arrays
        int gradesSorted[] = new int[15];
        int gradesScrambled[] = new int[15];
        // Get the inputs for the array
        gradesSorted = inputs();
        // Print the array
        System.out.print("The grades, sorted, are: ");
        printArray(gradesSorted);
        // Prompt the user to enter a grade to search for
        System.out.print("Enter a grade to search for: ");
        int targetGrade = myScanner.nextInt();
        // Run the binary search method
        binarySearch(gradesSorted, targetGrade);
        // Scramble the array and display the new array
        System.out.println("Scrambled:");
        gradesScrambled = scramble(gradesSorted);
        printArray(gradesSorted);
        // Prompt the user for a new grade to searcch for
        System.out.print("Enter a grade to search for: ");
        targetGrade = myScanner.nextInt();
        // Run the linear search method
        linearSearch(gradesScrambled, targetGrade);
    }
}