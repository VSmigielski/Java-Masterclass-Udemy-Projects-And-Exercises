// Coding Challenge
// Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day
// The method should not return any value
// Using a switch statement print "Sunday", "Monday",..."Saturday" if the int parameter "day" is 0, 1,...6
// respectively otherwise it should print invalid day
// Bonus
// Write a second solution using if then else, instead of using switch

public class Main {
    public static void main(String[] args) {
        // Tuesday
        DayOfTheWeek.printDayOfTheWeek(2);

        // Friday
        DayOfTheWeek.printDayOfTheWeek(5);

        // Invalid Day
        DayOfTheWeek.printDayOfTheWeek(8);

        // Monday
        DayOfTheWeek.printDayOfTheWeek2(1);

        // Thursday
        DayOfTheWeek.printDayOfTheWeek2(4);

        // Invalid Day
        DayOfTheWeek.printDayOfTheWeek2(7);
    }
}
