public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {
        // Check if any of the numbers are in the range of 13 to 19
        // First 13-19 OR Second 13-19 OR Third 13-19
        if ((first >= 13 && first <=19) || (second >= 13 && second <=19) || (third >= 13 && third <=19)) {
            // If any of the conditions are true, return true
            return true;
        }
        // If all conditions are false, return false
        return false;
    }
    public static boolean isTeen(int number) {
        // check if the number passed is between this range
        if (number >= 13 && number <= 19) {
            // If condition is true, return true
            return true;
        }
        // If condition is false, return false
        return false;
    }
}
