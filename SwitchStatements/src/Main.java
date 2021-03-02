public class Main {
    public static void main(String[] args) {
        // Declare variable int
        int value = 1;

        // Check if value is 1
        if (value == 1) {
            // If true, print message
            System.out.println("Value was 1");
            // Check if value is 2
        } else if (value == 2) {
            // If true, print message
            System.out.println("Value was 2");
            // If value is anything else
        } else {
            // Print message
            System.out.println("Was not 1 or 2");
        }

        // Declare another variable int
        int switchValue = 1;

        // Begin switch statement
        switch(switchValue) {
            // Check if value is 1
            case 1:
                // Print message
                System.out.println("Value was 1");
                // Closes out this case & jumps out of the code block
                break;
                // Check if value is 2
            case 2:
                // Print message
                System.out.println("Value was 2");
                // Closes out this case & jumps out of the code block
                break;
                // Check if value is 3, 4, or 5
            case 3: case 4: case 5:
                // Print message
                System.out.println("Value was 3, 4, or 5");
                // Print out the correct value not a guess
                System.out.println("Actually it was a " + switchValue);
                // Closes out this case & jumps out of the code block
                break;
                // For all other values
            default:
                // Print message
                System.out.println("Was not 1, 2, 3, 4, or 5");
                // Closes out this case & jumps out of the code block
                break;
        }

        // Coding Challenge
        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        // New variable type char
        char switchChar = 'C';

        // New switch statement
        switch(switchChar) {
            // Checks if char is A
            case 'A':
                // Prints message
                System.out.println("The character was an A");
                // Closes out this case & jumps out of the code block
                break;
                // Checks if char is B
            case 'B':
                // Prints message
                System.out.println("The character was a B");
                // Closes out this case & jumps out of the code block
                break;
                // Checks if char is C
            case 'C':
                // Prints message
                System.out.println("The character was a C");
                // Closes out this case & jumps out of the code block
                break;
                // Checks if char is D
            case 'D':
                // Prints message
                System.out.println("The character was a D");
                // Closes out this case & jumps out of the code block
                break;
                // Checks is char is E
            case 'E':
                // Prints message
                System.out.println("The character was an E");
                // Closes out this case & jumps out of the code block
                break;
                // For all other cases
            default:
                // Prints message
                System.out.println("The character was not an A, B, C, D, or E");
                // Closes out this case & jumps out of the code block
                break;
        }

        String month = "january";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            case "april":
                System.out.println("Apr");
                break;
            case "may":
                System.out.println("May");
                break;
            case "june":
                System.out.println("Jun");
                break;
            case "july":
                System.out.println("Jul");
                break;
            case "august":
                System.out.println("Aug");
                break;
            case "september":
                System.out.println("Sep");
                break;
            case "october":
                System.out.println("Oct");
                break;
            case "november":
                System.out.println("Nov");
                break;
            case "december":
                System.out.println("Dec");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
