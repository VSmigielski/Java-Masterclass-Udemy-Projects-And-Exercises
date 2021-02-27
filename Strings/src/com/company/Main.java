package com.company;

public class Main {

    public static void main(String[] args) {
	// 8 Primitive Data Types
        // Most commonly used:
        // int
        // double
        // boolean

        // byte -128 to 127
        // short
        // long
        // float
        // char

        // Declare a variable of String type
        String myString = "This is a string.";

        // Print to screen
        System.out.println("My string is equal to: " + myString);

        // Append the text to the string
        myString = myString + " And this is more...";

        // Print to screen
        System.out.println("My string is equal to: " + myString);

        // Append the text to the string using unicode character
        myString = myString + " \u00A9 2020";

        // Print to screen
        System.out.println("My string is equal to: " + myString);

        // Create a new string variable
        String numberString = "250.55";

        // Attempt to add the numbers
        numberString = numberString + "49.95";

        // Print to screen
        // The numbers were only appended as a string
        // Text data type not a numeric data type
        System.out.println(numberString);

        // Declare a string variable
        String lastString = "10";

        // Declare a variable int data type
        int myInt = 50;

        // Update the lastString contents
        lastString = lastString + myInt;

        // Print the results on screen
        // The results are solely appended with 50 after 10
        // Int is auto-converted to a string type
        System.out.println("Last string is equal to: " + lastString);

        // Declare a variable double data type
        double doubleNumber = 120.47d;

        // Update the lastString
        lastString = lastString + doubleNumber;

        // Print the results on the screen
        // Double is converted to string type and appended to the end
        System.out.println("Last string is equal to: " + lastString);

    }
}
