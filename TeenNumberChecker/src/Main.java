// We'll say that a number is "teen" if it is in the range 13-19 (inclusive)
// Write a method named hasTeen with 3 parameters of type int
// The method should return boolean and it needs to return true if one of the parameters is in range
// 13(inclusive)-19(inclusive). Otherwise, return false.

// Write another method named isTeen with 1 parameter type int
// The method should return boolean and it needs to return true if the parameter is in range
// 13-19(inclusive). Otherwise return false.

public class Main {
    public static void main(String[] args) {
        // Declare boolean variable to accept return value
        boolean result = TeenNumberChecker.hasTeen(9, 99, 19);
        // Print result on screen
        System.out.println(result);

        // Update boolean variable to new return value
        result = TeenNumberChecker.hasTeen(23, 15, 42);
        // Print result on screen
        System.out.println(result);

        // Update boolean variable to new return value
        result = TeenNumberChecker.hasTeen(22, 23, 34);
        // Print result on screen
        System.out.println(result);

        // Create boolean variable to accept return value
        boolean result2 = TeenNumberChecker.isTeen(9);
        // Print result on screen
        System.out.println(result2);

        // Update boolean variable to new return value
        result2 = TeenNumberChecker.isTeen(13);
        // Print result on screen
        System.out.println(result2);

    }
}
