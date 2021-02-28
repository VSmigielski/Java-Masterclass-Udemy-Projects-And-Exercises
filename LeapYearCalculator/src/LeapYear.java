public class LeapYear {
    public static boolean isLeapYear(int year) {
        // Check for values between the initial parameter range
        if (year >= 1 && year <= 9999) {
            // Check if the year is evenly divisible by 400 OR
            // If the year is evenly divisible by 100 not equaling 0
            // AND if the year is evenly divisible by 4
            if ( (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                // return true if either condition is met
                return true;
            }
            // return false if no conditions are met
            return false;
        }
        // return false if the year range falls out of 1 - 9999
        return false;
    }
}
