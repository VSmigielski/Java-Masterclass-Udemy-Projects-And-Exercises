package com.company;

public class Main {

    public static void main(String[] args) {

        // Declare an int variable to hold result of the arithmetic
        // 1 + 2 = 3
        // int result = 3; same as below without operators/operands
        int result = 1 + 2;

        // Print message and values onto the screen
        System.out.println("1 + 2 = " + result);

        // Declare a new variable to hold the past result
        int previousResult = result;

        // Print the variable's value on screen
        System.out.println("previousResult = " + previousResult);

        // Update the result value
        // 3 - 1 = 2
        result = result - 1;

        // Print the results on screen
        System.out.println("3 - 1 = " + result);

        // Print the variable's value on screen
        System.out.println("previousResult = " + previousResult);

        // Update the value of result times 10
        // 2 * 10 = 20
        result = result * 10;

        // Print the results on screen
        System.out.println("2 * 20 = " + result);

        // Update the value of result divided by 5
        // 20 / 5 = 4
        result = result / 5;

        // Print the results on screen
        System.out.println("20 / 5 = " + result);

        // Update the result to give remainder of (4 % 3) = 1
        result = result % 3;

        // Print the results on screen
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        // 1 + 1 = 2
        result++;

        // Print the results on screen
        System.out.println("1 + 1 = " + result);

        // result = result - 1;
        // 2 - 1 = 1
        result--;

        // Print the results on screen
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        // 1 + 2 = 3
        result += 2;

        // Print the results on screen
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        // 3 * 10 = 30
        result *= 10;

        // Print the results on screen
        System.out.println("3 * 10 = " + result);

        // result = result / 3;
        // 30 / 3 = 10
        result /= 3;

        // Print the results on screen
        System.out.println("30 / 3 = " + result);

        // result = result - 2;
        // 10 - 2 = 8
        result -= 2;

        // Print the results on screen
        System.out.println("10 - 2 = " + result);

        // Declare a boolean variable with value false
        boolean isAlien = false;

        // Begin an if-then statement
        // Check the condition for isAlien being false
        if (isAlien == false) {
            // returns true
            // This next line will be executed
            // Print message on screen
            System.out.println("It is not an alien!");

            // Print message on screen
            System.out.println("And I am scared of aliens ):");
        }

        // Declare variable int for top score
        int topScore = 100;

        // Check the condition of the variable
        // This if statement will not print the message
        if (topScore != 100) {
            // Print the message
            System.out.println("You got the high score!");
        }

        // Check the condition of the variable
        // This if statement will not print the message
        if (topScore > 100) {
            // Print the message
            System.out.println("You got the high score!");
        }

        // Check the condition of the variable
        // This if statement will print the message
        if (topScore >= 100) {
            // Print the message
            System.out.println("You got the high score!");
        }

        // Check the condition of the variable
        // This if statement will not print the message
        if (topScore < 100) {
            // Print the message
            System.out.println("You got the high score!");
        }

        // Check the condition of the variable
        // This if statement will print the message
        if (topScore <= 100) {
            // Print the message
            System.out.println("You got the high score!");
        }

        // Declare another variable
        int secondTopScore = 60;

        // Update the topScore to be under 100
        topScore = 80;

        // Check for condition of the variables
        // Both have to be evaluated as true to print message
        // This will print the message because both conditions are true
        if (topScore > secondTopScore && topScore < 100) {
            // Print the message
            System.out.println("Greater than second top score and less than 100");
        }

        secondTopScore = 81;
        // Check for condition of the variables
        // Both have to be evaluated as true to print message
        // This will not print the message due to the first condition being false
        // Extra parentheses makes the code a bit easier to read and avoid confusion
        if ((topScore > secondTopScore) && (topScore < 100)) {
            // Print the message
            System.out.println("Greater than second top score and less than 100.");
        }

        // Check the conditions for true or false
        // Left operand condition is false
        // Right operand condition is true
        // Using OR operator, the code will run since one condition is true
        if ((topScore > 90) || (secondTopScore <= 90)) {
            // Print the message
            System.out.println("Either or both of the conditions are true.");
        }

        // Update the secondTopScore value
        secondTopScore = 95;

        // Check the conditions for true or false
        // Left operand condition is false
        // Right operand condition is false
        // Using OR operator, the code will not run since neither condition is true
        if ((topScore > 90) || (secondTopScore <= 90)) {
            // Print the message
            System.out.println("Either or both of the conditions are true.");
        }

        // Declare new variable type int
        int newValue = 50;

        // Check if condition is true
        // If condition is written: (newValue = 50)
        // There will be an error since we are using assignment operator not equals to operator
        if (newValue == 50) {
            // Print message on screen
            System.out.println("This is true.");
        }

        // Declare new variable type int
        boolean isCar = false;

        // Check if condition is true
        // If condition is written: (isCar = true)
        // There should be an "error" since we are using assignment operator not equals to operator
        // Updated to use proper operator
        if (isCar == true) {
            // Print message on screen
            System.out.println("This is not supposed to happen.");
        }

        // Shortcut to check for true
        if (isCar) {
            // Print message on screen
            System.out.println("This is not supposed to happen.");
        }

        // Shortcut to check for false
        if (!isCar) {
            // Print message on screen
            System.out.println("This is not supposed to happen.");
        }

        // Begin Ternary Operators

        // Create a new boolean variable
        // isCar condition to test
        // Value to assign to wasCar if true
        // Value to assign to wasCar if false
        boolean wasCar = isCar ? true : false;

        // Check condition
        // Since isCar was assigned false, so the condition turns wasCar into false too
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Update isCar to true
        isCar = true;

        // Re-run the wasCar shortcut for if-then-else statement
        wasCar = isCar ? true : false;

        // Check condition
        // Since isCar was assigned true, so the condition turns wasCar into false too
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Declare a variable of int type
        int ageOfClient = 20;

        // Declare a new variable of boolean
        // Write a shortcut that evaluates the condition ageOfClient == 20
        // Is this condition true or false?
        // This condition is true
        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;

        // Check the condition of isEighteenOrOver after first result
        // The condition is true because the client is 20
        if (isEighteenOrOver) {
            // Print the message
            System.out.println("The client is over 18 because they are " + ageOfClient);
        }

        // Operator Challenge
        // 1. Create a double variable with a value of 20.00
        // 2. Create a second variable of type double with the value of 80.00
        // 3. Add both numbers together and multiply by 100.00
        // 4. Use the remainder operator to figure out what the remainder from the result of the operation
        // in Step 3 and 40.00. % works on doubles as well

        // Declare both variables of double type
        double firstValue = 20.00d;
        double secondValue = 80.00d;

        // Declare third variable of double type to hold result
        double resultChallenge = firstValue + secondValue;

        // Print message on screen
        System.out.println(resultChallenge);

        // Multiply the result of the addition by 100
        resultChallenge = resultChallenge * 100.00d;

        // Print message on screen
        System.out.println(resultChallenge);

        // Retrieve the result after multiplication and remainder after division of 40
        resultChallenge = resultChallenge % 40.00d;

        // Print message on screen
        System.out.println(resultChallenge);

        // Create a boolean to evaluate the condition of Step 4, is the result 0, true or false
        boolean isZero = resultChallenge == 0.00d ? true : false;

        // Print message on screen
        System.out.println(isZero);

        // If-then statement to check if boolean value is not true
        if (!isZero) {
            // Print this message if condition is not true
            // Print message on screen
            System.out.println("Got some remainder");
        }

    }
}
