public class isPerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; ++i) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum != number) {
            return false;
        }

        return true;
    }
}
