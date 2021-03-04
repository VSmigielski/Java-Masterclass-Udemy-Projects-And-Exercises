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
