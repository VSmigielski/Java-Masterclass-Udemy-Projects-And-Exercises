import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Allows user input to be read and parsed
        // "new" creates a new instance of Scanner
        Scanner scanner = new Scanner(System.in);

        // Reading the year as an int, requires a "nextLine" method after accepting the int user input
         System.out.println("Enter the year you were born: ");
         boolean hasNextInt = scanner.hasNextInt();

         if (hasNextInt) {
             int yearOfBirth = scanner.nextInt();
             scanner.nextLine();

             // Reading the year as a string
             // System.out.println("Enter the year you were born: ");
             // String yearOfBirth = scanner.nextLine();

             // If parsing, the program works as expected
             // int age = Integer.parseInt(yearOfBirth);

             // Get user's age
             int ageOfUser = 2021 - yearOfBirth;

             // Assign a variable to the user input
             System.out.println("Enter your name: ");
             // Call method nextLine to retrieve information from console
             String name = scanner.nextLine();

             // Check if the range is correct
             if (ageOfUser >= 0 && ageOfUser <= 100) {
                 // Print out the user's name
                 System.out.println("Your name is " + name + ", and you are " + ageOfUser + " years old.");
             } else {
                 // Print out an error message
                 System.out.println("Invalid year of birth.");
             }
         } else {
             System.out.println("Unable to parse year of birth.");
         }

        // Close the scanner
        scanner.close();
    }
}
