public class EqualityPrinter {
    // Create a method with 3 parameters
    public static void printEqual(int first, int second, int third) {
        // Check if any values are negative
        if (first < 0 || second < 0 || third < 0) {
            // Print error message
            System.out.println("Invalid Value");
            // Check if all the values are equal
        } else if (first == second && second == third && third == first) {
            // Print that all numbers are equal
            System.out.println("All numbers are equal");
            // Check if any set of numbers is equal
        } else if (first == second || second == third || third == first) {
            // Print that there was at least one set that was equal
            System.out.println("Neither all are equal or different");
            // Check that none of the sets are equal
        } else if (first != second && second != third && third != first) {
            // Print that all the numbers are different
            System.out.println("All numbers are different");
        }
    }
}
