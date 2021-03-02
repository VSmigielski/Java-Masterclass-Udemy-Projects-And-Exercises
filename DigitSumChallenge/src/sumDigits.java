public class sumDigits {
    public static int sumDigits(int number) {
        // Checks that the number is greater than 10 and no negatives
        if (number < 10) {
            // return -1
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            // Retrieve least-significant digit
            int digit = number % 10;
            // Add digit to sum
            sum += digit;

            // Drop the least-significant digit
            number /= 10;
        }
        return sum;
    }
}
