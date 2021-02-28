// Coding Exercise
// Write a method areEqualByThreeDecimalPlaces with two parameters of type double
// The method should return boolean and it needs to return true if two double numbers are the same up to three
// decimal places. Otherwise, return false.

public class Main {
    public static void main(String[] args) {
        // Declare boolean to accept return value
        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        // Print result on screen
        System.out.println(result);

        // Update boolean return value
        result = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        // Print result on screen
        System.out.println(result);

        // Update boolean return value
        result = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        // Print result on screen
        System.out.println(result);

        // Update boolean return value
        result = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        // Print result on screen
        System.out.println(result);

    }
}
