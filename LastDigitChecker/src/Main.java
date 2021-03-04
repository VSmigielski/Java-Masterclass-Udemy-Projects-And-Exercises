// Write a method named hasSameLastDigit with three parameters of type int
// Each number should be within the range of 10 and 1000 (inclusive). If one of the numbers is not within
// the range, the method should return false
// The method should return true if at least two of the numbers share the same rightmost digit
// Otherwise it should return false

// Write another method named isValid with one parameter type int
// The method needs to return true if the number is in range 10-1000 (inclusive) otherwise return false

public class Main {
    public static void main(String[] args) {
        // Declare variable to accept return value
        boolean result = LastDigitChecker.hasSameLastDigit(41, 22, 71);
        // Print return value on screen (true)
        System.out.println(result);

        // Update variable's return value
        result = LastDigitChecker.hasSameLastDigit(23, 32, 42);
        // Print return value on screen (true)
        System.out.println(result);

        // Update variable's return value
        result = LastDigitChecker.hasSameLastDigit(9, 99, 999);
        // Print return value on screen (false)
        System.out.println(result);

        // Declare another variable to accept return value
        boolean result2 = LastDigitChecker.isValid(10);
        // Print the return value on screen (true)
        System.out.println(result2);

        // Update return value
        result2 = LastDigitChecker.isValid(468);
        // Print the return value on screen (true)
        System.out.println(result2);

        // Update return value
        result2 = LastDigitChecker.isValid(1051);
        // Print the return value on screen (false)
        System.out.println(result2);
    }
}
