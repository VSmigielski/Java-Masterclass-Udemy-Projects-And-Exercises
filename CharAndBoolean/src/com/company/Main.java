package com.company;

public class Main {

    public static void main(String[] args) {

        // Declare a char variable
        // Char is only able to accept/save 1 character
        char myChar = 'D';

        // Backslash u tells Java this will be a unicode code
        char myUnicode = '\u0044';

        // Try using another unicode code (Copyright symbol)
        char myCopyrightChar = '\u00A9';

        // Print the values of the variable
        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myCopyrightChar);

        // Create two boolean data type variables
        // First is true
        boolean myTrueBooleanValue = true;
        // Second is false
        boolean myFalseBooleanValue = false;

        // Yes, the customer is over 21
        boolean isCustomerOverTwentyOne = true;
    }
}
