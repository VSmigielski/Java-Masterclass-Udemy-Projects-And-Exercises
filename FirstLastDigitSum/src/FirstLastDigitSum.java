public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        // Declare variables to use
        int lastDigit = 0;
        int firstDigit = 0;

        // If the number is less than 0
        if (number < 0) {
            // return -1
            return -1;
            // Otherwise check if the number only has 1 digit
        } else if (number <= 9) {
            // If only 1 digit, add the digit to itself
            number += number;
            // Return the number
            return number;
        }
        // Declare last digit
        lastDigit = number % 10;
        // While the number is greater than 0
        while (number > 0) {
            // Drop the lastDigit
            int digit = number % 10;
            // Drop the middle digits (unnecessary in calculation)
            number /= 10;
            // If the firstDigit is less than or equal to 9
            if (number <= 9) {
                // Make it equal to the number
                firstDigit = number;
                // Get out of the code block
                break;
            }
        }
        // Otherwise, return the firstDigit plus the lastDigit
        return (firstDigit + lastDigit);
    }
}
