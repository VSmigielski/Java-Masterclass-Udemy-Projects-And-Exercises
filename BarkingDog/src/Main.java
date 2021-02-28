// Coding Exercise
// We have a dog that likes to bark. We need to wake up if the dog is barking at night!
// Write a method shouldWakeUp that has 2 parameters
// 1st parameter should be of type boolean and be named barking--it represents if our dog is currently
// barking.
// 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a
// valid range of 0-23
// We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true
// In all other cases, return false
// If the hourOfDay parameter is less than 0 or > 23 return false

public class Main {
    public static void main(String[] args) {
        // Call method and assign result to a variable
        boolean result = BarkingDog.shouldWakeUp(true, 1);
        // Print result on screen
        System.out.println(result);

        // Call method and assign result to a variable
        result = BarkingDog.shouldWakeUp(false, 2);
        // Print result on screen
        System.out.println(result);

        // Call method and assign result to a variable
        result = BarkingDog.shouldWakeUp(true, 8);
        // Print result on screen
        System.out.println(result);

        // Call method and assign result to a variable
        result = BarkingDog.shouldWakeUp(true, -1);
        // Print result on screen
        System.out.println(result);
    }
}
