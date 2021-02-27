package com.company;

public class Main {

    public static void main(String[] args) {
        // Watch for keywords, int int = 5; won't work
        // keywords: false, true, null

        // Declare a new int2, this works because of the 2
        int int2 = 5;

        // Create a new expression after declaring variable (in the same line)
        // A mile is equal to 1.609344 kilometers
        // Expression does not include the data type
        // kilometers = (100 * 1.609344) is the expression
        double kilometers = (100 * 1.609344);

        // Declare variable
        // Expression: highScore = 50
        int highScore = 50;

        // Check condition for true
        // Expression: highScore == 50
        if (highScore == 50) {
            // Print message on screen
            // Expression: "This is an expression."
            System.out.println("This is an expression.");
        }

        // In the following code, write the parts that are expressions

        // Declare variable
        // Expression: score = 100
        int score = 100;

        // Check the condition for true
        // Expression: score > 99
        if (score > 99) {

            // Print the message
            // Expression: "You got the high score!"
            System.out.println("You got the high score!");

            // Update the score to value 0
            // Expression: score = 0
            score = 0;
        }

    }
}
