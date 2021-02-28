public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long minutes, long seconds) {
        // Check that the parameters are within a valid range
        if ((minutes < 0L) || (seconds < 0L) || (seconds > 59L)) {
            // If condition is true, send error message
            // return "Invalid value";
            return INVALID_VALUE_MESSAGE;
        }
        // Calculate hours
        long hours = minutes / 60L;
        // Calculate remainder of minutes
        long remainingMinutes = minutes % 60L;

        // Create a new string
        String hoursString = hours + "h";
        // If hours are less than 10, add a 0
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        // Create a new string
        String minutesString = remainingMinutes + "m";
        // If hours are less than 10, add a 0
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        // Create a new string
        String secondsString = seconds + "s";
        // If hours are less than 10, add a 0
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        // Return the proper format for time
        return hoursString + " " + minutesString + " " + secondsString;
    }

    // Overloaded method
    public static String getDurationString(long seconds) {
        // Check that seconds is not less than 0
        if (seconds < 0L) {
            // Send this message if condition is true
            // return "Invalid value";
            return INVALID_VALUE_MESSAGE;
        }
        // Calculate the minutes from seconds
        long minutes = seconds / 60L;
        // Calculate the leftover seconds
        long remainingSeconds = seconds % 60L;
        // Return the calculation from the method above
        return getDurationString(minutes, remainingSeconds);
    }

}
