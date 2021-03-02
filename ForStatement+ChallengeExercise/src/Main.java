public class Main {
    // Main program
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest: " + calculateInterest(10000.0, 2));
        System.out.println("10,000 at 3% interest: " + calculateInterest(10000.0, 3));
        System.out.println("10,000 at 4% interest: " + calculateInterest(10000.0, 4));
        System.out.println("10,000 at 5% interest: " + calculateInterest(10000.0, 5));

        // This is the formula for the For Statement
       //  for (init; termination; increment) {

       // }

        // Initialize a count
        // Process until i is 5
        // Add 1 to i for each iteration
        for (int i = 0; i < 5; i++) {
            // Prints the message while showing which loop we're in
            System.out.println("Loop " + i + ": hello!");
        }

        // Coding Challenge
        // Using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2, 3, 4, 5, 6, 7 and 8
        // and print the result to the console window

        // Set up the loop to begin at 2
        // Loop until we hit 9
        // Increment i by 1 for each loop
        for (int i = 2; i < 9; i++) {
            // Print the message on screen with calculation
            // Can cast i as a double, but not required
            System.out.println("10,000 at " + i + "% interest is: "
                    // Parsing the number from calculateInterest to only 2 decimal places
                    + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        // Print message to break the loops up
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Coding Challenge 2
        // How would you modify the for loop to do the same thing as shown but
        // to start from 8% and work back to 2%

        // Update i to begin at 8
        // Update condition to be i > 1 to be able to calculate value of 2
        // Rather than i++, do i--
        for (int i = 8; i > 1; i--) {
            // Print the message on screen with calculation
            // Can cast i as a double, but not required
            System.out.println("10,000 at " + i + "% interest is: "
                    // Parsing the number from calculateInterest to only 2 decimal places
                    + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        // Coding Challenge
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // If it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // If that count is 3 exit the for loop
        // hint: Use the break; statement to exit

        int count = 0;
        for (int i = 5; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

        // Begin number at 1
        // Check until number is not less than 7
        // Increment by 2 each iteration
        for (int number = 1; number < 7; number += 2) {
            System.out.println("Number: " + number);
        }

        // This for statement will never execute
        // Begin number at 1
        // Check if number is less than 0 (1 is not less than 0)
        // Increment by 2 each iteration
        for (int number = 1; number < 0; number += 2) {
            System.out.println("Number: " + number);
        }

        // "Infinite" for loop until int's space is maxed out
        // Since this loop increments up, the number will always be greater than 0
        // for (int number = 100; number > 0; number += 10) {
        //    System.out.println("Number: " + number);
        // }
    }

    // Method to calculate interest
    public static double calculateInterest(double amount, double interestRate) {
        // Use parentheses to make sure operator precedence is correct
        return (amount * (interestRate / 100));
    }

    // Create a method to check for prime numbers
    public static boolean isPrime(int n) {
        // 1 is not a prime number
        if (n == 1) {
            // return false
            return false;
        }

        // Begin the loop with value 2 since we already looped through 1
        // If i <= the int n divided by 2
        // Increment the loop to continue
        for (int i = 2; i <= n / 2; i++) {
            // If there is not a remainder for the number, then it is not a prime
            if (n % i == 0) {
                // return false
                return false;
            }
        }
        // Otherwise, return true (if there is a remainder)
        return true;
    }

    public static boolean isPrimeOptimized(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
