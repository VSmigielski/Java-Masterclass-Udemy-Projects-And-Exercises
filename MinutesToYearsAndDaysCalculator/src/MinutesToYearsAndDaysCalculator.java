public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        // Check if the parameter is negative
        if (minutes < 0) {
            // Print error message on scren
            System.out.println("Invalid Value");
        } // If minutes are greater than or equal to 0
        else if (minutes >= 0) {
            // Calculate hours
            long hours = minutes / 60;
            // Calculate days
            long days = hours / 24;
            // Calculate remainder of days
            long remainingDays = days % 365;
            // Calculate years
            long years = days / 365;

            // Print the information on screen
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
