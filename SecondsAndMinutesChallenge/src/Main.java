public class Main {

    public static void main(String[] args) {
        // Create a new variable to hold return value
        String result = SecondsAndMinutes.getDurationString(245L, 50L);
        // Print on screen (4h 5m 50s)
        System.out.println(result);

        // Create a new variable to hold return value
        String result2 = SecondsAndMinutes.getDurationString(3700L);
        // Print on screen (1h 1m 45s)
        System.out.println(result2);

        // Another way to pass the strings to print on screen without creating new variable for result
        // 1h 5m 45s
        System.out.println(SecondsAndMinutes.getDurationString(65L, 45L));

        // 1h 40m 0s
        System.out.println(SecondsAndMinutes.getDurationString(6000L));

        // 1h 5m 45s
        System.out.println(SecondsAndMinutes.getDurationString(3945L));

        // Invalid value
        System.out.println(SecondsAndMinutes.getDurationString(-41L));

        // Check seconds work with leading 0
        System.out.println(SecondsAndMinutes.getDurationString(65L, 9L));
    }
}
