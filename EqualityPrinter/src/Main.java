// Coding Exercise
// Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
// If one of the parameters is less than 0, print text "Invalid Value"
// If all numbers are equal, print text "All numbers are equal"
// If all numbers are different print text "All numbers are different"
// Otherwise print "Neither are equal or different

public class Main {
    public static void main(String[] args) {
        // Call the method from EqualityPrinter
        // All numbers are equal
        EqualityPrinter.printEqual(1, 1, 1);

        // Neither all are equal or different
        EqualityPrinter.printEqual(1, 1, 2);

        // Invalid Value
        EqualityPrinter.printEqual(-1, -1, -1);

        // All numbers are different
        EqualityPrinter.printEqual(1, 2, 3);

    }
}
