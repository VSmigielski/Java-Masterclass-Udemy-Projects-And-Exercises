package com.company;

public class Main {

    public static void main(String[] args) {
        // 8 Primitive Data Types
        // byte -128 to 127
        // short
        // int, common
        // long
        // float
        // double, common
        // char
        // boolean, common

        // Declare a string variable
        String myString = "This is a string.";

        // Print the string onto the screen
        System.out.println("My string is equal to: " + myString);

        // Append the string to include more
        myString = myString + " And this is more...";

        // Print the appended string onto the screen
        System.out.println("My string is equal to: " + myString);

        // Append the string
        myString = myString + " \u00A9 2020";

        // Print the appended string onto the screen
        System.out.println("My string is equal to: " + myString);

        // Create another string data type variable
        String numberString = "250.55";

        // Attempt to add these two strings
        numberString = numberString + "49.95";

        // This only prints the appended string, does not add the numbers
        System.out.println(numberString);

        // Create another string data type variable
        String lastString = "10";

        // Create a variable with int data type
        int myInt = 50;

        // Append the string to include the int variable
        lastString = lastString + myInt;

        // Print the results on the screen
        System.out.println("LastString is equal to: " + lastString);

    }
}
