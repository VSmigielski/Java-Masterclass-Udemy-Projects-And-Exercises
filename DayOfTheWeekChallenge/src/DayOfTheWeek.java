public class DayOfTheWeek {
    // Print the day of the week with a switch statement
    public static void printDayOfTheWeek(int day) {
        // Accept argument day
        switch(day) {
            // Check if day = 0
            case 0:
                // Print message with corresponding day
                System.out.println("Sunday");
                // Closes out the case & jumps out of the code block
                break;
            // Check if day = 1
            case 1:
                // Print message with corresponding day
                System.out.println("Monday");
                // Closes out the case & jumps out of the code block
                break;
            // Check if day = 2
            case 2:
                // Print message with corresponding day
                System.out.println("Tuesday");
                // Closes out the case & jumps out of the code block
                break;
            // Check if day = 3
            case 3:
                // Print message with corresponding day
                System.out.println("Wednesday");
                // Closes out the case & jumps out of the code block
                break;
            // Check if day = 4
            case 4:
                // Print message with corresponding day
                System.out.println("Thursday");
                // Closes out the case & jumps out of the code block
                break;
            // Check if day = 5
            case 5:
                // Print message with corresponding day
                System.out.println("Friday");
                // Closes out the case & jumps out of the code block
                break;
            // Check if day = 6
            case 6:
                // Print message with corresponding day
                System.out.println("Saturday");
                // Closes out the case & jumps out of the code block
                break;
            // For any other value
            default:
                // Print message with error
                System.out.println("Invalid Day");
                // Closes out the case & jumps out of the code block
                break;
        }
    }

    // Print day of the week using an if then else statement
    public static void printDayOfTheWeek2(int day) {
        // Checks if day = 0
        if (day == 0) {
            // Print message with corresponding day
            System.out.println("Sunday");
            // Checks if day = 1
        } else if (day == 1) {
            // Print message with corresponding day
            System.out.println("Monday");
            // Checks if day = 2
        } else if (day == 2) {
            // Print message with corresponding day
            System.out.println("Tuesday");
            // Checks if day = 3
        } else if (day == 3) {
            // Print message with corresponding day
            System.out.println("Wednesday");
            // Checks if day = 4
        } else if (day == 4) {
            // Print message with corresponding day
            System.out.println("Thursday");
            // Checks if day = 5
        } else if (day == 5) {
            // Print message with corresponding day
            System.out.println("Friday");
            // Checks if day = 6
        } else if (day == 6) {
            // Print message with corresponding day
            System.out.println("Saturday");
            // For any other values
        } else {
            // Print error message
            System.out.println("Invalid Day");
        }
    }
}
