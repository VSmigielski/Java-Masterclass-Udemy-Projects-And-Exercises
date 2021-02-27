package com.company;

public class Main {

    public static void main(String[] args) {
        // Use method to calculate the score
        calculateScore(true, 800, 5, 100);

        // Use method to calculate the score
        calculateScore(true, 10000, 8, 200);

        // Use method to calculate the score
        int highScore = calculateScore2(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore2(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        // Call method calculateHighScorePosition
        int position = calculateHighScorePosition(1500);
        // Call method displayHighScorePosition
        displayHighScorePosition("Andreas", position);

        // Call method calculateHighScorePosition
        position = calculateHighScorePosition(900);
        // Call method displayHighScorePosition
        displayHighScorePosition("Jenn", position);

        // Call method calculateHighScorePosition
        position = calculateHighScorePosition(400);
        // Call method displayHighScorePosition
        displayHighScorePosition("Gio", position);

        // Call method calculateHighScorePosition
        position = calculateHighScorePosition(50);
        // Call method displayHighScorePosition
        displayHighScorePosition("Rez", position);

        // Call method calculateHighScorePosition
        position = calculateHighScorePosition2(1500);
        // Call method displayHighScorePosition
        displayHighScorePosition("Andreas", position);

        // Call method calculateHighScorePosition
        position = calculateHighScorePosition2(900);
        // Call method displayHighScorePosition
        displayHighScorePosition("Jenn", position);

        // Call method calculateHighScorePosition
        position = calculateHighScorePosition2(400);
        // Call method displayHighScorePosition
        displayHighScorePosition("Gio", position);

        // Call method calculateHighScorePosition
        position = calculateHighScorePosition2(50);
        // Call method displayHighScorePosition
        displayHighScorePosition("Rez", position);
    }

    // Create a new method to calculate score
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // Check if condition is true
        if (gameOver) {
            // If gameOver = true, then execute this
            // Create a variable inside the code block, this is private to the code block
            int finalScore = score + (levelCompleted * bonus);
            // Add 2000 to the final score
            finalScore += 2000;
            // Print the message onto the screen
            System.out.println("Your final score was " + finalScore);
        }
    }

    // Create a new method to calculate score
    public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {
        // Check if condition is true
        if (gameOver) {
            // If gameOver = true, then execute this
            // Create a variable inside the code block, this is private to the code block
            int finalScore = score + (levelCompleted * bonus);
            // Add 2000 to the final score
            finalScore += 2000;
            // Return the value
            return finalScore;
        }
        // else {
        //    return -1;
        // }
        // OR
        return -1;
    }

    // Challenge with methods
    // Create a method called displayHighScorePosition
    // It should accept a player's name as a parameter, 2nd parameter as a position in the high score table
    // You should display the player's name along with a message like "managed to get into position" and the
    // position they got and a further message "on the high score table"
    //
    // Create a second method called calculateHighScorePosition
    // It should be sent one argument only, the player score
    // It should return an int
    // The return data should be:
    // 1. If the score is > 1000
    // 2. If the score is > 500 and < 1000
    // 3. If the score is >100 and < 500
    // 4. All other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400, and 50

    // Create method that accepts a name and the position that is returned from calculateHighScorePosition
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    // Create method that accepts a playerScore and sorts them with a position number
    public static int calculateHighScorePosition(int playerScore) {
        // Check if condition is true
        if (playerScore >= 1000) {
            // Return position 1 for scores greater than or equal to 1000
            return 1;
        } else if (playerScore >= 500) {
            // Return position 2 for scores greater than or equal to 500 < 1000
            return 2;
        } else if (playerScore >= 100) {
            // Return position 3 for scores greater than or equal to 100 < 500
            return 3;
        }
        return 4;
    }

    // another way to write the above
    public static int calculateHighScorePosition2(int playerScore) {
        // Assume position 4 will be returned
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
