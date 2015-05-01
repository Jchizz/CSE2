// Jonathan Chisholm
// 4/28/2015
// CSE 002
// Homework - 4D Arrays

// Import the random number generator
import java.util.Random;
// Import the scanner
import java.util.Scanner;

// Set the class and main method
public class FourDwin{
    
    public static void main(String [] arg){
        // Declare the scanner and tell it to take inputs
        Scanner myScanner = new Scanner(System.in);
        // Declare and initialize the random number generator
        Random randomGenerator = new Random();
        
        // Declare the size variables
        int x, y;
        // Get the x input
        while (true) {
            System.out.print("Please enter an integet X: ");
            // Make sure the first value is an integer
            if (myScanner.hasNextInt()) {
                // Store the scanned int as a value
                x = myScanner.nextInt();
                // Make sure the integer is greater than 0
                if (x > 0) {
                    // Accept x and break out of the loop
                    break;
                }
                else {
                    System.out.println("Invalid input.");
                }
            }
            else {
                System.out.println("Invalid input.");
            }
            // Clear the scanner
            myScanner.next();
            continue;
        }
        // Get the y input
        while (true) {
            System.out.print("Please enter an integet Y where Y > X: ");
            // Make sure the input is an integer
            if (myScanner.hasNextInt()) {
                // Store the scanned int as a value
                y = myScanner.nextInt();
                // Make sure that y is greater than x
                if (y > x) {
                    // Accept y and break out of the loop
                    System.out.println("");
                    break;
                }
                else {
                    System.out.println("Invalid input.");
                }
            }
            else {
                System.out.println("Invalid input.");
            }
            // Clear the scanner
            myScanner.next();
            continue;
        }
        
        // Create a new 4D array using the values given by the user
        double value;
        double[][][][] myArray = new double[3][][][];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new double[(int) randomGenerator.nextInt(y) + x][][];
        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = new double[(int) randomGenerator.nextInt(y) + x][];
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                for (int k = 0; k < myArray[i][j].length; k++) {
                    myArray[i][j][k] = new double[(int) randomGenerator.nextInt(y) + x];
                }
            }
        }
        
        
        // Fill the array with random doubles between 0 and 30, then print the array
        double val, valBig;
        int valInt;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                for (int k = 0; k < myArray[i][j].length; k++) {
                    for (int l = 0; l < myArray[i][j][k].length; l++) {
                        val = randomGenerator.nextDouble();
                        val *= 31;
                        valBig = val*10;
                        valInt = (int) valBig;
                        myArray[i][j][k][l] = ((double) valInt)/10;
                    }
                }
            }
        }
        System.out.println("Original array:");
        printArray(myArray);
        
        // Sort the array, starting with the 3D arrays
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sort3DArray(myArray[i]);
        }
        // Now sort the entire 4D array
        myArray = sort4DArray(myArray);
        
        // Print out the sorted array and its statistics
        System.out.println("Sorted array:");
        printArray(myArray);
        statArray(myArray);
    }
    
    // Create the method that finds and prints the array's statistics
    public static void statArray(double array[][][][]) {
        // Declare the sum, mean, and number of elements variables
        double sum = 0;
        double mean;
        int elements = 0;
        // Create four nested loops that will go through each value of each array within the 4D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        // Add the value of the array to the sum
                        sum += array[i][j][k][l];
                        // Increase the counter of the number of elements in the array
                        elements++;
                    }
                }
            }
        }
        // Compute the mean by dividing the sum by the number of elemnets
        mean = sum/elements;
        System.out.println("Members: "+elements);
        System.out.println("Sum: "+sum);
        System.out.println("Mean: "+mean);
    }
    
    // Create the method that will sort the 4D array from its smallest to largest 3D arrays
    public static double[][][][] sort4DArray(double array[][][][]) {
        // Declare the temp variables
        double[][][] temp;
        // Loop through each 3D array within the 4D array
        for (int i = 1; i < array.length; i++) {
            // Loop through the array and compare the lengths
            for (int j = i - 1; j >= 0; j--) {
                // If the array is smaller than the one to the left, move it over
                if (array[i].length < array[j].length) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                // If the array is equal to the one to the left and has a smaller 1D array, move it over
                else if (array[i].length == array[j].length && minimum(array[i]) < minimum(array[j])) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                // Otherwise, break out of the loop
                else {
                    break;
                }
            }
        }
        return array;
    }
    
    // Create a method to find the minimum in an array
    public static double minimum(double array[][][]) {
        // Find the minimum and maximum of array1
        // Declare and initialize the minimum and maximum variables
        double min = array[0][0][0];
        // Run through a for loop to check all 100 integers in the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    // Check to see if the value is less than the current min
                    if (array[i][j][k] < min) {
                        // Set the new minimum
                        min = array[i][j][k];
                    }
                }
            }
        }
        return min;
    }
    
    // Create the method that will sort a 3D array from its smallest to largest 1D arrays
    public static double[][][] sort3DArray(double array[][][]) {
        // Declare the minimum and temp variables
        int index = 0;
        double temp;
        double min;
        // Loop though each 2D array
        for (int i = 0; i < array.length; i++) {
            // Loop through each 1D array
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    min = array[i][j][k];
                    for (int l = k; l < array[i][j].length; l++) {
                        if (array[i][j][l] < min) {
                            min = array[i][j][l];
                            index = l;
                        }
                    }
                    temp = array[i][j][k];
                    array[i][j][k] = array[i][j][index];
                    array[i][j][index] = temp;
                    index = 0;
                }
            }
        }
        return array;
    }
    
    // Create the print method
    public static void printArray(double array[][][][]) {
        // Run through the 4D array
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            // Run through the 3D arrays
            for (int j = 0; j < array[i].length; j++) {
                // Run through the 2D arrays
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print("{{");
                    // Run through the 1D arrays
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        System.out.print(array[i][j][k][l]+" ");
                    }
                    System.out.print("}}");
                }
            }
            System.out.print("} ");
        }
        System.out.println("}");
    }
}