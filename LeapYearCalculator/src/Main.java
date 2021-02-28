// Coding Exercise
// Write a method isLeapYear with a parameter of type int named year
// The parameter needs to be greater than or equal to 1 and less than or equal to 9999
// If the parameter is not in range return false
// Otherwise, if it is in valid range, calculate if the year is a leap year and return true if it is a leap
// year, otherwise return false
// To determine whether a year is a leap year, follow these steps:
// 1. If the year is evenly divisible by 4, go to step 2. Otherwise go to step 5
// 2. If the year is evenly divisible by 100, go to step 3. Otherwise go to step 4
// 3. If the year is evenly divisble by 400, go to step 4. otherwise go to step 5
// 4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true
// 5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false
// The following years are not leap years
// 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
// Evenly divisible by 100, but not 400
// The following are leap years
// 1600, 2000, 2400
// Evenly divisible by 100 and 400

public class Main {
    public static void main(String[] args) {
        // Declare a variable to accept return value
        boolean result = LeapYear.isLeapYear(-1600);
        // Print return value
        System.out.println(result);

        // Update for new result
        result = LeapYear.isLeapYear(1600);
        // Print return value
        System.out.println(result);

        // Update for new result
        result = LeapYear.isLeapYear(2017);
        // Print return value
        System.out.println(result);

        // Update for new result
        result = LeapYear.isLeapYear(2000);
        // Print return value
        System.out.println(result);
    }
}
