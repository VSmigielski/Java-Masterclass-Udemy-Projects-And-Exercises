public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        // Check if the numbers are both greater than 10
        if (firstNumber < 10 || secondNumber < 10) {
            // If condition is met, return -1
            return -1;
        }
        // As long as the numbers are not equal to each other
        while (firstNumber != secondNumber) {
            // Check if the first is larger than the second
            if (firstNumber > secondNumber) {
                // If so, subtract the second from the first
                firstNumber = firstNumber - secondNumber;
            } else {
                // Otherwise, subtract the first from the second
                    secondNumber = secondNumber - firstNumber;
                }
            }
        // Return the secondNumber
            return secondNumber;
        }
    }
