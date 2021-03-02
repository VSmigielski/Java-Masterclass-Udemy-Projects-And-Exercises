// Coding Exercise
// Write a method called isOdd with an int parameter and call it number. The method needs to return
// a boolean.
// Check that the number is > 0, if it is not return false
// If the number is odd, return true, otherwise return false
// Write a second method called SumOdd that has 2 int parameters start and end, which represent a range of numbers
// The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
// It should call the method isOdd to check if each number is odd
// The parameter needs to be greater than of equal to start and both start and end parameters have to be
// greater than 0
// If those conditions are not satisfied then return -1 from the method to indicate invalid input

public class Main {
    public static void main(String[] args) {
        // Result Odd (true)
        boolean result = SumOddRange.isOdd(1);
        // Print result
        System.out.println(result);

        // Result Invalid/False
        result = SumOddRange.isOdd(-1);
        // Print result
        System.out.println(result);

        // Result Even (false)
        result = SumOddRange.isOdd(2);
        // Print result
        System.out.println(result);

        // Result Odd (true)
        result = SumOddRange.isOdd(25);
        // Print result
        System.out.println(result);

        // Create variable to hold the return value
        int sum = SumOddRange.sumOdd(1, 100);
        // Print the sum of the numbers from the range
        System.out.println(sum);

        // Update the variable's return value
        sum = SumOddRange.sumOdd(-1, 100);
        // Print the sum of the numbers from the range
        System.out.println(sum);

        // Update the variable's return value
        sum = SumOddRange.sumOdd(100, 100);
        // Print the sum of the numbers from the range
        System.out.println(sum);

        // Update the variable's return value
        sum = SumOddRange.sumOdd(13, 13);
        // Print the sum of the numbers from the range
        System.out.println(sum);

        // Update the variable's return value
        sum = SumOddRange.sumOdd(100, -1000);
        // Print the sum of the numbers from the range
        System.out.println(sum);

        // Update the variable's return value
        sum = SumOddRange.sumOdd(100, -1000);
        // Print the sum of the numbers from the range
        System.out.println(sum);
    }
}
