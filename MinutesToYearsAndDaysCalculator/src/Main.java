// Coding Exercise
// Write a method printYearsAndDays with parameter of type long named minutes
// The method should not return anything (void) and it needs to calculate the years and days from
// the minutes parameter
// If the parameter is less than 0, print the text "Invalid Value"
// Otherwise if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
// XX represents the original value minutes
// YY represents the calculated years
// ZZ represents the calculated days

public class Main {
    public static void main(String[] args) {
        // Call method from class
        // 525600 min = 1 y and 0 d
        MinutesToYearsAndDaysCalculator.printYearsAndDays(525600);

        // 1051200 min = 2 y and 0 d
        MinutesToYearsAndDaysCalculator.printYearsAndDays(1051200);

        // 561600 min = 1 y and 25 d
        MinutesToYearsAndDaysCalculator.printYearsAndDays(561600);

        // Invalid Value
        MinutesToYearsAndDaysCalculator.printYearsAndDays(-525600);

        // 0 min = 0 y and 0 d
        MinutesToYearsAndDaysCalculator.printYearsAndDays(-0);
    }
}
