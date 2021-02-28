public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Gio", 500);
        System.out.println("New score is: " + newScore);

        int scoreSecond = calculateScore(75);
        System.out.println("Second score is: " + scoreSecond);

        // Print on screen
        calculateScore();

        // Calculates 182.88
        calcFeetAndInchesToCentimeters(6, 0);
        // Calculates 226.06
        calcFeetAndInchesToCentimeters(7, 5);
        // Invalid inches parameter
        calcFeetAndInchesToCentimeters(7, -1);
        // Invalid feet parameter
        calcFeetAndInchesToCentimeters(-7, 5);
        // Calculates 8 ft, 4 in and 254cm
        calcFeetAndInchesToCentimeters(100);
        // Calculates 13 ft, 1 in and 398.78 cm
        calcFeetAndInchesToCentimeters(157);
        // Invalid inches parameter
        calcFeetAndInchesToCentimeters(-10);
    }

    // Create a new method to calculate score
    public static int calculateScore(String playerName, int score) {
        // Print a message with the name and score on screen
        System.out.println("Player: " + playerName + " Score: " + score);
        // return the score
        return score * 1000;
    }

    // Overloaded method
    // This method has the same name but only 1 parameter
    public static int calculateScore(int score) {
        System.out.println("Unnamed player got score: " + score);
        return score * 1000;
    }

    // Overloaded method
    // This method has the same name but only 1 parameter
    public static int calculateScore() {
        System.out.println("Unnamed player, no player score");
        return 0;
    }

    // Coding Challenge
    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters
    // Feet is the first parameter, inches is the second parameter
    //
    // You should validate that the first parameter is >=0
    // You should validate that the 2nd parameter inches is >= 0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimeters comprise the feet and inches
    // passed to this method and return that value
    //
    // Create a 2nd method of the same name but with only one parameter
    // Inches is the parameter
    // Validate that its >= 0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part:
    // Call the other overloaded method passing the correct feet and inches
    // calculated so that it cna calculate correctly
    // hints: use double for your number datatypes
    // 1 inch = 2.54cm and one foot = 12 inches

    // Initial method
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid parameters feet or inches");
            return -1;
        }
        double inchesConvert = feet * 12;
        double inchesTotal = inchesConvert + inches;
        double convertCentimeters = inchesTotal * 2.54;
        // Another solution
        // double centimeters = (feet * 12) * 2.54;
        // centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + convertCentimeters);
        return convertCentimeters;
    }

    // Overloaded method
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches parameter");
            return -1;
        }
        // This line could be written double feet = (int) inches / 12; (eliminates second line below)
        double feet = inches / 12;
        feet = (int) feet;
        // This line could be written double remainderInches = (int) inches % 12; (eliminates above line)
        double remainderInches = inches % 12;
        System.out.println(inches + " inches = " + feet + " feet, " + remainderInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }
}
