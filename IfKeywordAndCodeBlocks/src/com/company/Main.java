package com.company;

public class Main {

    public static void main(String[] args) {
        // Declare variables
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // Check condition is true
        // If no code brackets, only the initial statement after the if statement is ran under condition
        if (score == 5000) {
            // If true, print message on screen
            System.out.println("Your score was 5000.");
        }

        // If no brackets, only the initial statement after the if statement is ran under condition
        if (score == 4000)
            // If true, print message on screen
            System.out.println("Your score was 5000.");
        // This line will be printed always because there are no brackets
        System.out.println("This was executed.");

        // Check if condition is true
        if (score < 5000) {
            // If condition is true, this is executed
            System.out.println("Your score was less than 5000");
        }
        // If condition is false, this is executed
        else {
            System.out.println("Got here.");
        }

        // Check if condition is true
        if (score <= 5000) {
            // If condition is true, execute this statement
            System.out.println("Your score was less than 5000");
        }
        // If condition is false, execute this statement
        else {
            System.out.println("Got here.");
        }
        // Update score to value 4000
        score = 4000;

        // Check condition for true
        if (score < 5000 && score > 1000) {
            // If score is less than 5000 and greater than 1000, print message
            System.out.println("Your score was less than 5000 but greater than 1000");
        }
        // If score is less than 1000, print message
        else if (score < 1000){
            System.out.println("Your score was less than 1000");
        }
        // If both conditions are false, execute this message
        else {
            System.out.println("Got here");
        }

        // Update score to value 800
        score = 800;

        // Check condition for true
        if (score < 5000 && score > 1000) {
            // If score is less than 5000 and greater than 1000, print message
            System.out.println("Your score was less than 5000 but greater than 1000");
        }
        // If score is less than 1000, print message
        else if (score < 1000){
            System.out.println("Your score was less than 1000");
        }
        // If both conditions are false, execute this message
        else {
            System.out.println("Got here");
        }

        // Update score to 5000
        score = 5000;

        // Check condition for true
        if (score < 5000 && score > 1000) {
            // If score is less than 5000 and greater than 1000, print message
            System.out.println("Your score was less than 5000 but greater than 1000");
        }
        // If score is less than 1000, print message
        else if (score < 1000){
            System.out.println("Your score was less than 1000");
        }
        // If both sets conditions are false, execute this message
        else {
            System.out.println("Got here");
        }

        // Update the score again
        score = 800;

        // Check condition for true
        // The condition can also be written: if (gameOver)
        if (gameOver == true) {
            // If gameOver = true, then execute this
            // Create a variable inside the code block, this is private to the code block
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Challenge
        // Print out a second score on the screen with the following:
        // 1. Score is set to 10000
        // 2. levelCompleted is set to 8
        // 3. bonus is set to 200
        // 4. But make sure the first printout above still displays as well

        // Update values for the variables involved
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            // If gameOver = true, then execute this
            // Create a variable inside the code block, this is private to the code block
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
