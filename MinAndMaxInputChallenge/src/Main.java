import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered
// Before the user enters the number, print the message "Enter number:"
// If the user enteres an invalid number, break out of the loop and print the minimum and maximum number
// Hint: User an endless while loop
//
public class Main {
    public static void main(String[] args) {
        // Create new instance of scanner
        Scanner scanner = new Scanner(System.in);

        // Initialize list to hold user input
        List<Integer> numbers = new ArrayList<>();

//        Initialize flag
//        boolean first = true;

        // Never ending loop
        while (true) {
            // Ask user for input
            System.out.println("Enter number:");

            // Create a boolean to check if a valid number has been entered into the console
            boolean isAnInt = scanner.hasNextInt();

            // If this boolean is true
            if (isAnInt) {
                // Handles the variable
                int number = scanner.nextInt();

//                Another way to handle the min/max
//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
//                if (number > maximum) {
//                    maximum = number;
//                }
//
//                if (number < minimum) {
//                    minimum = number;
//                }

                // Add the number to the list
                numbers.add(number);
            } else {
                // False
                break;
            }

            // Handle end of line enter key
            scanner.nextLine();
        }
        // Show the user the numbers entered
        System.out.println(numbers);

        int min = getMin(numbers);
        int max = getMax(numbers);

        // Show the sum of the numbers to user
        System.out.println("The minimum of the numbers is: " + min);
        System.out.println("The maximum of the numbers is: " + max);

        // Close scanner
        scanner.close();
    }

    public static Integer getMin(List<Integer> list)
    {
        // initialize `min` to some maximum value
        Integer min = Integer.MAX_VALUE;

        // loop through every element in the list and
        // compare the minimum found so far with the current value
        for (Integer i: list)
        {
            // update min if found to be more than the current element
            if (min > i) {
                min = i;
            }
        }

        return min;
    }

    public static Integer getMax(List<Integer> list)
    {
        // initialize `max` to some minimum value
        Integer max = Integer.MIN_VALUE;

        // loop through every element in the list and
        // compare the maximum found so far with the current value
        for (Integer i: list)
        {
            // update max if found to be less than the current element
            if (max < i) {
                max = i;
            }
        }

        return max;
    }
}

