package com.company;

public class Main {

    public static void main(String[] args) {

        // Create a variable of byte data type
        byte byteValue = 120;

        // Create a variable of short data type
        short shortValue = 23700;

        // Create a variable of int data type
        int intValue = 2147483;

        // Create a variable of long data type
        long longValue = 50000L + (10L * (byteValue + shortValue + intValue));

        // Print the value for longValue
        System.out.println(longValue);

        // To be able to use a short, you must add (short) in front of the expression
        short shortTotal = (short) (1000 + (10 * (byteValue + shortValue + intValue)));

    }
}
