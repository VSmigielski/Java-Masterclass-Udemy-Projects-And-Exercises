public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        // Check if number is negative
        if (number < 0) {
            // If negative, return -1
            return -1;
        }
        // Initialize remainder and sum
        int remainder = 0;
        int sum = 0;

        // While the number is greater than 0
        while (number > 0) {
            // Calculate for the last digit
            remainder = number % 10;
            // If the remainder when evenly divisible by 2 is 0, add to sum, otherwise add 0 to sum
            sum += (remainder % 2 == 0) ? remainder:0;
            // Divide the number by 10 to get the next digit to check
            number /= 10;
        }
        // return the sum
        return sum;
    }
}
