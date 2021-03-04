// Coding Exercise
// Write a method hasSharedDigit with two parameters of type int
// Each number should be within range of 10 (inclusive) and 99 (inclusive). If one of the numbers is not within
// the range, the method should return false
// The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23
// otherwise, the method should return false

public class Main {
    public static void main(String[] args) {
        // Declare variable to hold return value
        boolean result = SharedDigit.hasSharedDigit(12, 23);
        // Print return value on screen (true)
        System.out.println(result);

        // Update return value
        result = SharedDigit.hasSharedDigit(9, 99);
        // Print return value on screen (false)
        System.out.println(result);

        // Update return value
        result = SharedDigit.hasSharedDigit(15, 55);
        // Print return value on screen (true)
        System.out.println(result);

        // Update return value
        result = SharedDigit.hasSharedDigit(12, 13);
        // Print return value on screen (true)
        System.out.println(result);

        // Declare variable to hold return value
        boolean result2 = SharedDigit.hasSharedDigit2(12, 23);
        // Print return value on screen (true)
        System.out.println(result2);

        // Update return value
        result2 = SharedDigit.hasSharedDigit2(9, 99);
        // Print return value on screen (false)
        System.out.println(result2);

        // Update return value
        result2 = SharedDigit.hasSharedDigit2(15, 55);
        // Print return value on screen (true)
        System.out.println(result2);

        // Update return value
        result2 = SharedDigit.hasSharedDigit2(12, 13);
        // Print return value on screen (true)
        System.out.println(result2);

    }
}
