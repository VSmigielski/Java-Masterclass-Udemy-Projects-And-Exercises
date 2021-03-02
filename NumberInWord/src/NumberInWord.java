public class NumberInWord {
    // Switch statement version
    public static void printNumberInWord(int number) {
        // Switch statement to accept argument
        switch(number) {
            // Check if number = 0
            case 0:
                // Print corresponding word on screen
                System.out.println("ZERO");
                // Closes out the case & jumps out of code block
                break;
            // Check if number = 1
            case 1:
                // Print corresponding word on screen
                System.out.println("ONE");
                // Closes out the case & jumps out of code block
                break;
            // Check if number = 2
            case 2:
                // Print corresponding word on screen
                System.out.println("TWO");
                // Closes out the case & jumps out of code block
                break;
            // Check if number = 3
            case 3:
                // Print corresponding word on screen
                System.out.println("THREE");
                // Closes out the case & jumps out of code block
                break;
            // Check if number = 4
            case 4:
                // Print corresponding word on screen
                System.out.println("FOUR");
                // Closes out the case & jumps out of code block
                break;
            // Check if number = 5
            case 5:
                // Print corresponding word on screen
                System.out.println("FIVE");
                // Closes out the case & jumps out of code block
                break;
            // Check if number = 6
            case 6:
                // Print corresponding word on screen
                System.out.println("SIX");
                // Closes out the case & jumps out of code block
                break;
            // Check if number = 7
            case 7:
                // Print corresponding word on screen
                System.out.println("SEVEN");
                // Closes out the case & jumps out of code block
                break;
            // Check if number = 8
            case 8:
                // Print corresponding word on screen
                System.out.println("EIGHT");
                // Closes out the case & jumps out of code block
                break;
            // Check if number = 9
            case 9:
                // Print corresponding word on screen
                System.out.println("NINE");
                // Closes out the case & jumps out of code block
                break;
            // For any other values
            default:
                // Print OTHER
                System.out.println("OTHER");
                // Closes out the case & jumps out of code block
                break;
        }
    }

    // IfThenElse version
    public static void printNumberInWord2(int number) {
        // Check if number = 0
        if (number == 0) {
            // Print corresponding word on screen
            System.out.println("ZERO");
            // Check if number = 1
        } else if (number == 1) {
            // Print corresponding word on screen
            System.out.println("ONE");
            // Check if number = 2
        } else if (number == 2) {
            // Print corresponding word on screen
            System.out.println("TWO");
            // Check if number = 3
        } else if (number == 3) {
            // Print corresponding word on screen
            System.out.println("THREE");
            // Check if number = 4
        } else if (number == 4) {
            // Print corresponding word on screen
            System.out.println("FOUR");
            // Check if number = 5
        } else if (number == 5) {
            // Print corresponding word on screen
            System.out.println("FIVE");
            // Check if number = 6
        } else if (number == 6) {
            // Print corresponding word on screen
            System.out.println("SIX");
            // Check if number = 7
        } else if (number == 7) {
            // Print corresponding word on screen
            System.out.println("SEVEN");
            // Check if number = 8
        } else if (number == 8) {
            // Print corresponding word on screen
            System.out.println("EIGHT");
            // Check if number = 9
        } else if (number == 9) {
            // Print corresponding word on screen
            System.out.println("NINE");
            // For all other values
        } else {
            // Print OTHER
            System.out.println("OTHER");
        }
    }
}
