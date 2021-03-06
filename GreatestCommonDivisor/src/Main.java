// Coding Exercise
// Write a method named getGreatestCommonDivisor with two parameters of type int named first and second
// If one of the parameters is < 10, the method should return -1 to indicate an invalid value
// The method should return the greater common divisor of the two numbers (int)
// The greatest common divisor is the largest positive integer that can fully divide each of the integers
// without leaving a remainder



public class Main {
    public static void main(String[] args) {
        // Declare variable to accept return value
        int result = GreatestCommonDivisor.getGreatestCommonDivisor(12, 30);
        // Print the result on screen (6)
        System.out.println(result);

        // Update variable with return value
        result = GreatestCommonDivisor.getGreatestCommonDivisor(25, 15);
        // Print the result on screen (5)
        System.out.println(result);

        // Update variable with return value
        result = GreatestCommonDivisor.getGreatestCommonDivisor(9, 18);
        // Print the result on screen (-1)
        System.out.println(result);

        // Update variable with return value
        result = GreatestCommonDivisor.getGreatestCommonDivisor(81, 153);
        // Print the result on screen (9)
        System.out.println(result);
    }
}
