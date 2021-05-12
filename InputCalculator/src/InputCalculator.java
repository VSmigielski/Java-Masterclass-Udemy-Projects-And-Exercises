import java.util.Scanner;

public class InputCalculator {
    public static void inputCalculator() {
        // Create new instance of scanner
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int counter = 0;
        int sum = 0;
        int avg = 0;

        // Never ending loop
        while (true) {
            // To show the number we're on
            // Ask user for input
            System.out.println("Enter number:");

            // Create a boolean to check if a valid number has been entered into the console
            boolean isAnInt = scanner.hasNextInt();

            // If this boolean is true
            if (isAnInt) {
                // Handles the variable
                int number = scanner.nextInt();
                // Increment counter
                counter++;
                // Add the number to the sum of the previous numbers
                sum += number;

            } else {
                // False
                break;
            }

            // Handle end of line enter key
            scanner.nextLine();
        }

        if (counter > 0) {
            avg = sum / counter;
        }

        // Show the sum of the numbers to user
        System.out.println("SUM = " + sum + " AVG = " + avg);

        // Close scanner
        scanner.close();
    }
}
