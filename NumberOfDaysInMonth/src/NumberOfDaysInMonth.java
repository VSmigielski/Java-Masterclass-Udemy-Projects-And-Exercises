public class NumberOfDaysInMonth {
    // Create a method to check for leap years
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

    // Create a method to retrieve the days in the month
    public static int getDaysInMonth(int month, int year) {
        // Check that month is at least 1 but not more than 12 and that year is at least 1 and less than 9999
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            // If check is false, return -1 (invalid parameters)
            return -1;
        }
        // Check if month is 2, if it is two and is a leap year
        if (isLeapYear(year) && month == 2) {
            // Return 29 days
            return 29;
        }

        // Switch statement to check cases for month
        switch(month) {
            // If April, June, September, or November
            case 4: case 6: case 9: case 11:
                // There are 30 days in the month
                return 30;
                // If the year isn't a leap year, February has 28 days
            case 2:
                // Return 28 days
                return 28;
                // For all other months
            default:
                // The amount of days is 31
                return 31;
        }
    }
}
