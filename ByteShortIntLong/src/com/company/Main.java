package com.company;

// Begin main class
public class Main {

    // Begin main program
    public static void main(String[] args) {

        // Create an int data type variable with a value
        int myValue = 10000;

        // Create an int data type for a minimum value
        int myMinIntValue = Integer.MIN_VALUE;

        // Create an int data type for a maximum value
        int myMaxIntValue = Integer.MAX_VALUE;

        // Display values on screen per myMinIntValue and myMaxIntValue
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);

        // Display Busted Max Value (Cycles to MIN, overflow)
        System.out.println("Busted MAX Value: " + (myMaxIntValue + 1));

        // Display Busted Min Value (Cycles to MAX, underflow)
        System.out.println("Busted MIN Value: " + (myMinIntValue - 1));

        // Create a new variable for testing
        int MyMaxIntTest = 2_147_483_647;

        // Create a variable for byte data type
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        // Display byte's minimum and maximum values, respectively
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        // Create a variable for short data type
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        // Display short's minimum and maximum values, respectively
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        // Create a variable for long data type, for long add an L at the end
        long myLongValue = 100L;

        // Create a variable for long data type
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        // Display long's minimum and maximum values, respectively
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);

        // Create a new long variable
        long bigLongLiteralValue = 2_147_483_647_234L;

        // Display value of variable on screen
        System.out.println(bigLongLiteralValue);

        // Number is an int, does not accept 8 at the end
        short bigShortLiteralValue = 32767;

        // Create a new total with int data type, no errors
        int myTotal = (myMinIntValue / 2);

        // Create a new total with byte data type, MinValue is shown as an int first
        // Add (byte) to get rid of error
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        // Create a new value with short data type, MinValue is shown as an int first
        // Add (short) to get rid of error
        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}
