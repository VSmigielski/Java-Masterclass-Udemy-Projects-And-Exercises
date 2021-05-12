public class LargestPrimeFactor {
    public static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return -1;
        } else {
            int div = 2;
            while (div < n) {
                if (n % div != 0) {
                    div++;
                } else {
                    n = n / div;
                    div = 2;
                }
            }
            return n;
        }
    }
    }
