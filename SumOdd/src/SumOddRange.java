public class SumOddRange {
    // Create a method to check if a number is odd
    public static boolean isOdd(int number) {
        // Check if the number is less than 0
        if (number < 0) {
            // If condition is true, return false
            return false;
        }

        // Otherwise continue check
        // Check if the number has a remainder when divided by 2
        if (number % 2 == 1) {
            // If remainder is found, return true
            return true;
            // Otherwise no remainder
        } else {
            // return false
            return false;
        }
    }

    // Create a method to sum the odd numbers within the start and end range
    public static int sumOdd(int start, int end) {
        // Check is start and end is > 0
        // Check that the end value is larger than the start value
        if (start < 0 || end < 0 || end < start) {
            // If condition is met, return -1
            return -1;
        }

        // Initialize sum
        int sum = 0;

        // Begin for loop
        // Begin i at start value
        // Condition i to be less than or equal end value
        // Iterate the loop
        for (int i = start; i <= end; i++) {
            // Check if the number in i is Odd
            if (isOdd(i)){
                // If odd, add i to sum
                sum += i;
            }
        }
        // Return the sum value
        return sum;
    }
}
