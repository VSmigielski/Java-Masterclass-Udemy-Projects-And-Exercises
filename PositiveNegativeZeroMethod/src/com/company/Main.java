package com.company;

// Coding Exercise
// Write a method called checkNumber with an int parameter number
// The method should not return any value, and it needs to print out:
// "positive" if the parameter number is > 0
// "negative" if the parameter number is < 0
// "zero" if the parameter number is equal to 0

public class Main {

    public static void main(String[] args) {
        // Run the method with a positive
	    checkNumber(4);

	    // Run the method with a negative
	    checkNumber(-3);

	    // Run the method with a 0
	    checkNumber(0);
    }

    // Create a method that checks if a number is positive, negative, or zero
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        }
    }
}
