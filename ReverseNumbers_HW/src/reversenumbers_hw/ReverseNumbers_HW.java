/**
 * CIT 111 Intro to Programming 
 * Assignment 7 
 * 10/29/2014 
 * Author: Garrett Cooper
 * Number Reverser Program
 */

package reversenumbers_hw;

// Imports utility package classes, arrays and scanner
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers_HW {

    public static void main(String[] args) {

        // Declares an instance variable that holds the length array length value
        final int INTEGERS = 10;

        // Declares console variable to read in integers to create an array
        Scanner console = new Scanner(System.in);
        
        // Prints out program header
        System.out.println("CIT111 Fall 2014, Assignment 7"); 
        System.out.println("Garrett Cooper"); 
        System.out.println("Number Reverser Pro Version 15.2\n"); 
        
        // Declares and instantiates an array, 'arrayInteger'
        int[] arrayInteger = new int[INTEGERS];

        System.out.print("Please enter " + INTEGERS + " integers >>\n");
        // 'For loop' is used to collect integers into 'arrayInteger'
        for (int i = 0; i < arrayInteger.length; i++) {
            System.out.print("\tEnter integer "
                    + (i + 1) + " : ");

            arrayInteger[i] = console.nextInt(); // read grade    

        }

        // Prints integers entered by calling the 'printArray' method  
        System.out.print("\nHere are the " + INTEGERS + " integers you entered: ");
        printArray(arrayInteger);

        // Prints integers entered in reverse order by calling the 'reverseArray' method  
        System.out.print("\nHere are the " + INTEGERS + " integers you entered"
                + ", in reverse order: ");
        reverseArray(arrayInteger);

        // Declares instantiates a new variable, 'sortedInteger' this new... 
        // variable calls the 'sortArray' method to sort the 'arrayInteger' array    
        int[] sortedInteger = sortArray(arrayInteger);

        // Prints integers entered in sorted order by calling the 'sortArray' method  
        System.out.print("\nHere are the " + INTEGERS + " integers you entered"
                + ", in sorted order: ");
        printArray(sortedInteger);

        // Prints out the last index element of the sorted array, or...
        // the maximum value
        System.out.println("\nThe maximum integer value entered is: "
                + sortedInteger[arrayInteger.length - 1]);

        // Prints out the first index element of the sorted array, or...
        // the minimum value
        System.out.print("The minimum integer value entered is: "
                + sortedInteger[0]);
        
        // Return a line
        System.out.println();

        // Thank you message
        System.out.println("\nThank you for using the Number Reverser"
                + " Pro Version 15.2.\n"
                + "The program will now terminate.");
        
        // Return a line
        System.out.println();
    }

    // Creates a method that will return an integer sorted array
    private static int[] sortArray(int[] array) {
        // First make a copy of the array by calling the 'copyOf' method
        // to make a copy of the original array, in order to manipulate the array
        //int[] arrayCopy = Arrays.copyOf(array, array.length);
        // Sort the array copy
        Arrays.sort(array);

        return array;
    }

    // Creates an array method that prints the array in a single line
    private static void printArray(int[] array) {
        // Uses a 'for loop' to print the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

        System.out.println();
    }

    // Creates an array method that prints the array in reverse
    private static void reverseArray(int[] array) {
        // Uses a 'for loop' to print the array in reverse order;
        // Note: 'i' starts at the end of the array and counts back
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }

        System.out.println();
    }
}
