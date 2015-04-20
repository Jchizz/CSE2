// Jonathan Chisholm
// 4/21/2015
// CSE 002
// Homework 12 - Multiply

// Import the random number generator
import java.util.Random;
// Import the scanner
import java.util.Scanner;

// Set the class and main method
public class Multiply {

    public static int[][] randomMatrix(int width, int height) {
        // Declare and initialize the random number generator
        Random randomGenerator = new Random();
        // Declare the output matrix
        int matrix[][] = new int[width][height];
        
        // Use loops to fill the matrix
        // The first loop will move from row to row
        for (int i = 0; i < width; i++) {
            // The second will fill each row
            for (int j = 0; j < height; j++) {
                matrix[j][i] = randomGenerator.nextInt((10 - -10) + 1) + -10;
            }
        }
        return matrix;
    }
    
    // Create the print matrix method
    public static void printMatrix(int[][] array) {
        // Ensure that there is actually an array
        if (array == null) {
            System.out.println("the array was empty!");
        }
        else {
            // Cycle through the columns
            for (int i = 0; i < array.length; i++) {
                System.out.print("[ ");
                // Go through each value per column
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]+" ");
                }
            System.out.println("]");
            }
        }
    }
    
    public static int[][] multiply(int[][] array1, int[][] array2) {
        // Declare the output matrix
        int matrix[][] = new int[array1.length][array1[0].length];
        // Create a variable that will say whether the heights and widths are equad
        boolean equal = true;
        // Determine whether the columns are equal in size
        if (array1.length == array2.length) {
            // For each column, check whether each row is equal in size
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].length != array2[i].length) {
                    // If not, change the equal variable to false
                    equal = false;
                }
            }
        }
        
        // If the arrays are the same size, do the calculations
        // Create a value to store each member of the result matrix
        int result = 0;
        if (equal == true) {
            // Compute through the calculations
            // Loop through each row of the result matrix
            for (int i = 0; i < array1.length; i++) {
                // Go through each value per row in the result matrix
                for (int j = 0; j < array1[i].length; j++) {
                    // Go through each of the input arrays and multiply the respective values
                    for (int n = 0; n < array1.length; n++) {
                        // Add the products to the result variable
                        result += array1[i][n]*array2[n][j];
                        // Check system. Uncomment print lines to check values
                        // System.out.print("array1: "+array1[i][n]);
                        // System.out.print("     array2: "+array2[n][j]);
                        // System.out.print("     product: "+array1[i][n]*array2[n][j]);
                        // System.out.print("     result: "+result);
                        // System.out.println("");
                    }
                    matrix[i][j] = result;
                    result = 0;
                }
            }
            return matrix;
        }
        // If they arrays are not the same size, print an error message
        else {
            System.out.println("The arrays are different sizes and cannot be multiplied");
            return null;
        }
    }
    
    public static void main (String [] args) {
        // Declare the scanner
        Scanner scan = new Scanner(System.in);
        // Declare the dimensional variables
        int width1, height1, width2, height2;
        // Get correct dimensions
        while (true) {
            // Prompt the user to enter the first height
            System.out.print("Enter the first height as an int: ");
            while (true) {
                // Make sure the input is an integer
                if (scan.hasNextInt()) {
                    // Store the scanned int as the height
                    height1 = scan.nextInt();
                    // Make sure the integer is greater than 0
                    if (height1 > 0) {
                        break;
                    }
                    else {
                        System.out.println("Please enter a positive value");
                    }
                }
                else {
                    System.out.println("Please enter an integer");
                }
            }
            // Prompt the user to enter the second height
            System.out.print("Enter the second height as an int: ");
            while (true) {
                // Make sure the input is an integer
                if (scan.hasNextInt()) {
                    // Store the scanned int as the height
                    height2 = scan.nextInt();
                    // Make sure the integer is greater than 0
                    if (height2 > 0) {
                        break;
                    }
                    else {
                        System.out.println("Please enter a positive value");
                    }
                }
                else {
                    System.out.println("Please enter an integer");
                }
            }
            // Prompt the user to enter the first width
            System.out.print("Enter the first width as an int: ");
            while (true) {
                // Make sure the input is an integer
                if (scan.hasNextInt()) {
                    // Store the scanned int as the width
                    width1 = scan.nextInt();
                    // Make sure the integer is greater than 0
                    if (width1 > 0) {
                        break;
                    }
                    else {
                        System.out.println("Please enter a positive value");
                    }
                }
                else {
                    System.out.println("Please enter an integer");
                }
            }
            // Prompt the user to enter the second width
            System.out.print("Enter the second width as an int: ");
            while (true) {
                // Make sure the input is an integer
                if (scan.hasNextInt()) {
                    // Store the scanned int as the width
                    width2 = scan.nextInt();
                    // Make sure the integer is greater than 0
                    if (width2 > 0) {
                        break;
                    }
                    else {
                        System.out.println("Please enter a positive value");
                    }
                }
                else {
                    System.out.println("Please enter an integer");
                }
            }
            // Make sure the first height and second width are equal and vice versa
            if (height1 == width2) {
                if (height2 == width1) {
                    if (height1 == width1) {
                        break;
                    }
                    else {
                        System.out.println("All dimensions must be the same!");
                    }
                }
                else {
                    System.out.println("All dimensions must be the same!");
                }
            }
            else {
                System.out.println("All dimensions must be the same!");
            }
        }
        
        // Declare two matrices and a product matrix
        int[][] matrix1 = new int[width1][height1];
        int[][] matrix2 = new int[width2][height2];
        int[][] productMatrix = new int[width2][height1];
        // Fill the matrices with random variables
        matrix1 = randomMatrix(width1, height1);
        matrix2 = randomMatrix(width2, height2);
        // Print the two starting matrices
        System.out.println("Input matrix 1:");
        printMatrix(matrix1);
        System.out.println("Input matrix 2:");
        printMatrix(matrix2);
        // Compute and print the final matrix
        productMatrix = multiply(matrix1, matrix2);
        System.out.println("Product matrix:");
        printMatrix(productMatrix);
    }
}