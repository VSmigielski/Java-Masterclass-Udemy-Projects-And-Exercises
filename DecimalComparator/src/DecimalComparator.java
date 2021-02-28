public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        // Variables to multiply the numbers out of their decimals
        first = first * 1000;
        second = second * 1000;

        // Cast the doubles as ints
        int first2 = (int) first;
        int second2 = (int) second;

        // Compare the cast variables
        if (first2 == second2) {
            // If the condition is true, return true
            return true;
        }
        // If the condition is not true, return false
        return false;
    }
}
