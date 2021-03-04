// Coding Exercise
// Write a method named getEvenDigitSum with one parameter of type int called number
// The method should return the sum of the even digits within the number
// If the number is negative, the method should return -1 to indicate an invalid value

public class Main {
    public static void main(String[] args) {
        // Declare variable to hold the return value
        int result = EvenDigitSum.getEvenDigitSum(123456789);
        // Print the result on screen (20)
        System.out.println(result);

        // Update the variable with the new value
        result = EvenDigitSum.getEvenDigitSum(252);
        // Print the result on screen (4)
        System.out.println(result);

        // Update the variable with the new value
        result = EvenDigitSum.getEvenDigitSum(-22);
        // Print the result on screen (-1) due to negative number
        System.out.println(result);
    }
}
