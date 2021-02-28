// Coding Exercise
// Write a method hasEqualSum with 3 parameters type int
// The method should return boolean and it needs to return true if the sum of the first and second parameter
// is equal to the third parameter. Otherwise return false.


public class Main {
    public static void main(String[] args) {
        // Declare variable to accept return value
        boolean result = EqualSumChecker.hasEqualSum(1, 1, 1);
        // Print result on screen
        System.out.println(result);

        // Update result with new return value
        result = EqualSumChecker.hasEqualSum(1 ,1, 2);
        // Print result on screen
        System.out.println(result);

        // Update result with new return value
        result = EqualSumChecker.hasEqualSum(1, -1, 0);
        // Print result on screen
        System.out.println(result);
    }


}
