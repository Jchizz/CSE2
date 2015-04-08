// Jonathan Chisholm
// 4/8/2015
// CSE 002
// Homework 10 - Remove Elements

// Import the random number generator
import java.util.Random;

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(newArray1,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  // Create the random input method to create the array
  public static int[] randomInput() {
      // Declare and initialize the random number generator
      Random randomGenerator = new Random();
      // Declare and initialize the array
      int randomArray[] = new int[10];
      // Loop through the random number generator until 10 numbers are generated
      for (int i = 0; i < 10; i++) {
          // Generate the random number
          int randomInt = randomGenerator.nextInt(10);
          // Add the number to the array
          randomArray[i] = randomInt;
      }
      // Return the array
      return randomArray;
  }
  
  // Create the delete method
  public static int[] delete(int[] list, int pos) {
      // Create a counter variable for the new array
      int j = 0;
      // Create a temp variable to hold the values in the input array
      int temp;
      // Create a new result array
      int deleteArray[] = new int [9];
      // Create a loop that will go through each value of the array
      for (int i = 0; i < list.length; i++) {
        // Store the value of the input array
        temp = list[i];
        // Check to see if the value stored in the array matches the position
        if (i != pos) {
            // Add the value to the array
            deleteArray[j] = temp;
            j++;
        }
      }
      // Return the new array
      return deleteArray;
  }
  
  // Create the remove method
  public static int[] remove(int[] list, int target) {
      // Create a temp variable to hold the values in the input array
      int temp1;
      // Create a counting variable
      int counter = 0;
      // Create a counter variable for the new array
      int j = 0;
      // Create a loop that counts how many times the target number is in the array
      for (int i = 0; i < list.length; i++) {
          if (list[i] == target) {
           // Add the counter
           counter++;
          }
      }
      // Create a variable for the array length
      int arrayLength = 9 - counter;
      // Create a new result array
      // The counter will help determine the length of the new array
      int removeArray[] = new int [arrayLength];
      // Create a loop that will go through each value of the awway
      for (int i = 0; i < list.length; i++) {
          // Store the value of the input array
          temp1 = list[i];
          // Check to see if the value stored in the array matches the target number
          if (temp1 != target) {
              // Add the value to the array
              removeArray[j] = temp1;
              j++;
          }
      }
      // Return the new array
      return removeArray;
  }
}
