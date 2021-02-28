public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        // Check if summer value is false, check if temperature is between 25 and 35
        if (!summer && temperature >= 25 && temperature <= 35) {
            // if condition is met, return true
            return true;
            // Check if summer is true, check if temperature is between 25 and 45
        } else if (summer && temperature >= 25 && temperature <= 45) {
            // If condition is met, return true
            return true;
        } else {
            // For all other conditions, return false
            return false;
        }
    }
}
