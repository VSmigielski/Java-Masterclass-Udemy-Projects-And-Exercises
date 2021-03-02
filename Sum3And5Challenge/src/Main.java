// Coding Challenge
// Create a for statement using a range of numbers from 1 to 1000 inclusive
// Sum all numbers that can be divided by 3 & 5
// For those numbers that met the above conditions, print out the number
// break out of hte loop once you find 5 numbers that met the above conditions
// After breaking out of the loop, print the sum of the numbers that met the above conditions

public class Main {
    // Begin Main program
    public static void main(String[] args) {
        // Initialize count to be able to break the loop
        int count = 0;

        // Initialize sum
        int sum = 0;

        // Begin for loop
        // Begin i at 1
        // Condition i to be less than or equal to 1000
        // Iterate the loop for each number
        for (int i = 1; i <= 1000; i++) {
            // Check if there is a remainder, if no remainder, the number is evenly divisible by 15
            if (i % 15 == 0) {
                // If condition is met, increase the count
                count++;
                // Add the number found to the sum
                sum += i;
                // Print the number that is found
                System.out.println("The number found is: " + i);
                // If the count reaches 5
                if (count == 5) {
                    // Print message of loop exit
                    System.out.println("Exiting for loop");
                    // Break out of the loop
                    break;
                }
            }
        }
        // Print the message of the sum of the numbers found
        System.out.println("The sum of the numbers is: " + sum);
    }
}
