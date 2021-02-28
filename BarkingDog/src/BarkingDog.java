public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // If dog is not barking OR the hourOfDay is under 0 OR the hourDayOfDay is over 23
        // OR hourOfDay is past 7 and under 23
        if (!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
            // return false
            return false;
        }
        // For all other conditions, return true
        return true;
    }
}
