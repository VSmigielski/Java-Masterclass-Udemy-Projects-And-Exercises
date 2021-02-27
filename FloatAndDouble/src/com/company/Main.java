package com.company;

// Begin class
public class Main {

    // Begin main program
    public static void main(String[] args) {

        // Create variables with float data type
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        // Print these values on console
        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);

        // Create variables with double data type
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        // Print these values on console
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

        // Create variable of int data type
        int myIntValue = 5;

        // Print the value in the console
        System.out.println("My Int Value: " + myIntValue);

        // Create variable of float data type
        float myFloatValue = 5;

        // Print the value in the console
        System.out.println("My Float Value: " + myFloatValue);

        // Create variable of double data type
        double myDoubleValue = 5;

        // Print the value in the console
        System.out.println("My Double Value: " + myDoubleValue);

        // Update variables of float and double with decimals
        // Float requires a "f" at the end to be error free, or use (float) in front of the value
        // To cast: myFloatValue = (float) 5.25;
        float mySecondFloatValue = 5.25f;

        // Double does not require a "d" at the end, but better practice to include it
        double mySecondDoubleValue = 5.25d;

        // Update variable values through division
        myIntValue = 5 / 2;
        myFloatValue = 5f / 2f;
        myDoubleValue = 5d / 2d;

        // Print the value in the console
        // Because the int is a whole number, remainder is not handled
        // The amount is how many times the value being divided can take the second number into itself
        System.out.println("My Int Value: " + myIntValue);

        // Print the value in the console
        System.out.println("My Float Value: " + myFloatValue);

        // Print the value in the console
        System.out.println("My Double Value: " + myDoubleValue);

        // Update variable values through division
        myIntValue = 5 / 3;
        myFloatValue = 5f / 3f;
        myDoubleValue = 5d / 3d;

        // Print the value in the console
        // Because the int is a whole number, remainder is not handled
        // The amount is how many times the value being divided can take the second number into itself
        System.out.println("My Int Value: " + myIntValue);

        // Print the value in the console
        System.out.println("My Float Value: " + myFloatValue);

        // Print the value in the console
        System.out.println("My Double Value: " + myDoubleValue);

        // Challenge
        // Convert a given number of pounds to kilograms
        double pounds = 1d;
        double kilogramConvert = 0.45359237d;

        // Print on screen to show the conversion is being done
        System.out.println("Converting " + pounds + " pound to kilograms.");

        // Convert pound to kilograms
        double kilograms = pounds * kilogramConvert;

        // Print the conversion answer on screen
        System.out.println("The weight in kilograms of " + pounds + " pound is " + kilograms + " kilogram.");

        // Update value in variable
        pounds = 200d;

        // Print on screen to show the conversion is being done
        System.out.println("Converting " + pounds + " pound(s) to kilograms.");

        // Convert pound to kilograms
        kilograms = pounds * kilogramConvert;

        // Print the conversion answer on screen
        System.out.println("The weight in kilograms of " + pounds + " is " + kilograms + " kilograms.");

        // Create two new variables (different styles)
        double pi = 3.1415927d;
        // Underscores do not affect the readability to the computer
        // 0 at the end is ignored since it is not needed
        double anotherNumber = 3_000_000.4_567_890d;

        // Print the results of the variables on screen
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
