// Jonathan Chisholm
// 3/27/2015
// CSE 002
// Lab 09 - Methods

// In this lab, my program will:
// -Create four methods that output a random adjective, noun, past-tense verb, or object
// -Call upon the methods to create an eight word sentence, including two "the"s
// -Ask the user if they would like to generate another sentence

// Import the random number generator
import java.util.Random;
// Import the scanner
import java.util.Scanner;

// Set the class
public class Methods {
    
    // Create the method for the adjectives
    public static String adjective() {
        // Declare and initialize the random number generator
        Random randomGenerator = new Random();
        // Generate the random number
        int randomInt = randomGenerator.nextInt(10);
        // Declare the adjective variable
        String adj = "";
        // Use a switch statement that contains 9 adjectives from which to select a word
        switch (randomInt) {
            case 0:
                adj += "brown ";
                break;
            case 1:
                adj += "black ";
                break;
            case 2:
                adj += "white ";
                break;
            case 3:
                adj += "quick ";
                break;
            case 4:
                adj += "lazy ";
                break;
            case 5:
                adj += "small ";
                break;
            case 6:
                adj += "excited ";
                break;
            case 7:
                adj += "tan ";
                break;
            case 8:
                adj += "clever ";
                break;
            case 9:
                adj += "happy ";
                break;
            default:
                adj += "error!";
                break;
        }
        return adj;
    }
    
    // Create the method for the subject
    public static String subject() {
        // Declare and initialize the random number generator
        Random randomGenerator = new Random();
        // Generate the random number
        int randomInt = randomGenerator.nextInt(10);
        // Declare the subject variable
        String sub = "";
        // Use a switch statement that contains 9 nouns from which to select a word
        switch (randomInt) {
            case 0:
                sub += "dog ";
                break;
            case 1:
                sub += "cat ";
                break;
            case 2:
                sub += "rat ";
                break;
            case 3:
                sub += "mouse ";
                break;
            case 4:
                sub += "fox ";
                break;
            case 5:
                sub += "hamster ";
                break;
            case 6:
                sub += "rabbit ";
                break;
            case 7:
                sub += "bunny ";
                break;
            case 8:
                sub += "deer ";
                break;
            case 9:
                sub += "bear ";
                break;
            default:
                sub += "error! ";
                break;
        }
        return sub;
    }
    
    // Create the method for the subject
    public static String verb() {
        // Declare and initialize the random number generator
        Random randomGenerator = new Random();
        // Generate the random number
        int randomInt = randomGenerator.nextInt(10);
        // Create the verb variable
        String ver = "";
        // Use a switch statement that contains 9 verbs from which to select a word
        switch (randomInt) {
            case 0:
                ver += "passed ";
                break;
            case 1:
                ver += "bit ";
                break;
            case 2:
                ver += "hit ";
                break;
            case 3:
                ver += "licked ";
                break;
            case 4:
                ver += "jumped ";
                break;
            case 5:
                ver += "dodged ";
                break;
            case 6:
                ver += "sniffed ";
                break;
            case 7:
                ver += "ate ";
                break;
            case 8:
                ver += "scratched ";
                break;
            case 9:
                ver += "loved ";
                break;
            default:
                ver += "error!";
                break;
        }
        return ver;
    }
    
    // Create the method for the object
    public static String object() {
        // Declare and initialize the random number generator
        Random randomGenerator = new Random();
        // Generate the random number
        int randomInt = randomGenerator.nextInt(10);
        // Create the object variable
        String obj ="";
        // Use a switch statement that contains 9 nouns from which to select a word
        switch (randomInt) {
            case 0:
                obj += "dog.";
                break;
            case 1:
                obj += "cat.";
                break;
            case 2:
                obj += "rat.";
                break;
            case 3:
                obj += "mouse.";
                break;
            case 4:
                obj += "fox.";
                break;
            case 5:
                obj += "hamster.";
                break;
            case 6:
                obj += "rabbit.";
                break;
            case 7:
                obj += "bunny.";
                break;
            case 8:
                obj += "deer.";
                break;
            case 9:
                obj += "bear.";
                break;
            default:
                obj += "error!";
                break;
        }
        return obj;
    }
    
    // Create the main method
    public static void main (String [] args) {
        
        // Declare and initialize the scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Begin the loop so the user may generate multiple sentences
        while (true) {
            
            // Create the sentence
            // First, declare and initialize the sentence string and
            String sentence = "The ";
            // Add the first adjective to the sentence
            sentence += adjective();
            // Add an "and"
            sentence += "and ";
            // Add the second adjective to the sentence
            sentence += adjective();
            // Add the subject of the sentence
            sentence += subject();
            // Add the verb to the sentence
            sentence += verb();
            // Add the next "the" to the sentence
            sentence += "the ";
            // Add the third adjective to the sentence
            sentence += adjective();
            // Add the subject to the object
            sentence += object();
            
            // Print out the sentence
            System.out.println(sentence);
            
            // Ask if the user would like to generate a new sentence
            System.out.print("Enter y or Y to go again: ");
            // Create a string variable to be used for the confirmation
            String confirm = "";
            confirm = myScanner.next();
            // Check if the user responded with a "y" or "Y" for yes
            if (!confirm.equals("y")  && !confirm.equals("Y")) {
                break;
            }
        }
    }
}