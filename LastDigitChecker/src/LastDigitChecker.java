public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        // Checks if any of the numbers are not within 10-1000
        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            // If conditions are met, return false
            return false;
        }

        // Calculate the remainder to get the last digit in each number
        int firstRemainder = firstNumber % 10;
        int secondRemainder = secondNumber % 10;
        int thirdRemainder = thirdNumber % 10;

        // Compare the remainders, if at least one of these conditions is met, return true
        if (firstRemainder == secondRemainder || secondRemainder == thirdRemainder ||
        firstRemainder == thirdRemainder) {
            return true;
        }
        // Otherwise return false
        return false;
    }

    public static boolean isValid(int number) {
        // Check the number is between 10-1000
        if (number < 10 || number > 1000) {
            // If not, return false
            return false;
        }
        // Otherwise return true
        return true;
    }
}

