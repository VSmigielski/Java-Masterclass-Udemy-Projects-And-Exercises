// Coding Exercise
// Write a method named sumFirstAndLastDigit with one parameter of type int called number
// The method needs to find the first and last digit of the parameter number passed to the method
// using a loop and return the sum of the first and last digit of that number
// If the number is negative, then the method needs to return -1 to indicate an invalid value

public class Main {
    public static void main(String[] args) {
        // Setup a variable to accept return value (4)
        int result = FirstLastDigitSum.sumFirstAndLastDigit(252);
        // Print result on screen
        System.out.println(result);

        // Update result value (9)
        result = FirstLastDigitSum.sumFirstAndLastDigit(257);
        // Print result on screen
        System.out.println(result);

        // Update result value (0)
        result = FirstLastDigitSum.sumFirstAndLastDigit(0);
        // Print result on screen
        System.out.println(result);

        // Update result value (10)
        result = FirstLastDigitSum.sumFirstAndLastDigit(5);
        // Print result on screen
        System.out.println(result);

        // Update result value (-1)
        result = FirstLastDigitSum.sumFirstAndLastDigit(-10);
        // Print result on screen
        System.out.println(result);
    }
}
