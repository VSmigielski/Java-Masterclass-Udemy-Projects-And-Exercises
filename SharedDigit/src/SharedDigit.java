public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        // Checks parameters are all within 10-99 inclusive
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            // If not, return false
            return false;
        }

        // Set up the variables to do the second check
            int firstRemainder = firstNumber % 10;
            int secondRemainder = secondNumber % 10;
            int firstNumberDigit = firstNumber / 10;
            int secondNumberDigit = secondNumber / 10;
            // If at least one of these conditions is true, return true
            if (firstRemainder == secondRemainder || firstRemainder == secondNumberDigit ||
            secondRemainder == firstNumberDigit || secondNumberDigit == firstNumberDigit) {
                return true;
            }
            // If none of those conditions are true, return false
        return false;
    }

    // Optimized method
    public static boolean hasSharedDigit2(int x, int y) {
        // Check that the numbers are between 10-99 inclusive
        if((x < 10) || (x > 99) || (y < 10) || (y > 99)) {
            // If not, return false
            return false;
            // Otherwise
        } else {
            // Return true if one or more of these conditions is met
            return((x / 10 == y / 10) || (x / 10 == y % 10)
                    || (y / 10 == x % 10) || (x % 10 == y % 10));
        }
    }
}
