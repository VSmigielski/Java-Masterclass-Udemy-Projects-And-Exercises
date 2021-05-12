import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create new instance of scanner
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int counter = 0;
        int sum = 0;

        // Never ending loop
        while (true) {
            // To show the number we're on
            int order = counter + 1;
            // Ask user for input
            System.out.println("Enter number #" + order + ": ");

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
                if (counter == 10) {
                    break;
                }
            } else {
                // False
                System.out.println("Invalid number");
            }

            // Handle end of line enter key
            scanner.nextLine();
        }

        // Show the sum of the numbers to user
        System.out.println("The sum of the numbers is: " + sum);

        // Close scanner
        scanner.close();

    }
}
