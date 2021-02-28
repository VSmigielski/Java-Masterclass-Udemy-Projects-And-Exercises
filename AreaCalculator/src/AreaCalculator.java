public class AreaCalculator {
    // Create method to accept a radius parameter
    public static double area(double radius) {
        // Check if either value passed is negative
        if ( radius < 0) {
            // Print error message
            System.out.println("Invalid Value");
            // If negative, return -1.0
            return -1.0;
        }
        // Calculate the area using parameters and constant PI
        double area = Math.PI * radius * radius;
        // return area
        return area;
    }

    // Create method to accept length and width
    public static double area(double x, double y) {
        // Check if either value passed is negative
        if (x < 0 || y < 0) {
            // Print error message
            System.out.println("Invalid Value");
            // If negative, return -1.0
            return -1.0;
        }
        // Calculate the area using the parameters
        double area = x * y;
        // return area
        return area;
    }
}
