public class Main {
    public static void main(String[] args) {
        // Initialize count
        int count = 1;

        // While the count is not equal to 6
        while (count != 6) {
            // Print this message with the loop counts
            System.out.println("Count value is: " + count);
            // Increment count by 1
            count++;
        }

        // An identical for loop to the above while loop
        for (int i = 1; i < 6; i++) {
            // Print message of the loop count on screen
            System.out.println("Count value is: " + i);
        }

        // Initialize new count value
        int count2 = 1;

        // Infinite loop
        while (true) {
            // Check this expression
            if (count2 == 6) {
                // Break out of the code block once condition is true
                break;
            }
            // Otherwise, print the count value on screen
            System.out.println("Count value is: " + count2);
            // Increment the count
            count2++;
        }

        // do-while equivalent to previous loops
        // Initialize new count
        int count3 = 1;

        // Do executes at least once
        // Do this while the condition is not met
        do {
            // Print message on screen
            System.out.println("Count value was: " + count3);
            // Increment count
            count3++;
            // While statement to evaluate condition
        } while (count3 != 6);

        // Initialize new count
        int count4 = 6;

        // Do executes at least once
        // Do this while the condition is not met
        do {
            // Print message on screen
            System.out.println("Count value was: " + count4);
            // Increment count
            count4++;

            // Set another condition
            if (count4 > 100) {
                // Once count reaches 100, break out of the code block
                break;
            }
            // While statement to evaluate condition
        } while (count4 != 6);

        // Coding Challenge
        // Declare variable for where to begin in the while loop
        int number = 4;
        // Declare variable for where to end in the while loop
        int finishNumber = 20;

        // While number is less than finished number, loop
        while (number <= finishNumber) {
            // Increment number by 1
            number++;
            // Checks if the number is even
            if (!isEvenNumber(number)) {
                // If while condition is still valid continues through the loop whether true or false
                continue;
            }
            // Print message to show the even numbers from the loop
            System.out.println("Even number: " + number);
        }

        // Coding Challenge 2
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and at the end, display the total number of even numbers found
        // Break once 5 even numbers are found, then display the total number of even numbers found

        // Declare variable for where to begin in the while loop
        int number1 = 4;
        // Declare variable for where to end in the while loop
        int finishNumber1 = 20;
        // Declare variable to count the amount of even numbers found
        int count5 = 0;

        // While number is less than finished number, loop
        while (number1 <= finishNumber1) {
            // Increment number by 1
            number1++;
            // Checks if the number is even
            if (!isEvenNumber(number1)) {
                // If while condition is still valid continues through the loop whether true or false
                continue;
            } else {
                // Print message to show the even numbers from the loop
                System.out.println("Even number: " + number1);
                // Increment count
                count5++;
                // Check if count5 equals 5
                if (count5 == 5) {
                    // Print the message to show how many even numbers were found
                    System.out.println("The amount of even numbers found is: " + count5);
                    // Break out of the code block
                    break;
                }
            }
        }
    }

    // Coding Challenge
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is an even number or not
    // Return true if an even number, otherwise return false

    public static boolean isEvenNumber(int number) {
        // Check for a remainder, if remainder is 0, it's even
        if (number % 2 == 0) {
            // return true
            return true;
            // For all other conditions
        } else {
            // return false
            return false;
        }
    }
}
