public class Main {
    public static void main(String[] args) {
        // Declare the string
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        // This will throw an exception if parsing to int is attempted
        String numberAsString2 = "2018a";

        // Parse string to an int type
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        // Check concatenation vs normal integer addition
        numberAsString += 1;
        number += 1;

        // Simply concatenates the += 1 (auto-parse to string)
        System.out.println("numberAsString = " + numberAsString);
        // Checks that 2018 was parsed using number
        System.out.println("number = " + number);

        // Declare the string
        String numberAsString3 = "2018.125";
        System.out.println("numberAsString3 = " + numberAsString3);

        // Parse string to double type
        double number2 = Double.parseDouble(numberAsString3);
        System.out.println("number2 = " + number2);

        // Check conversion style
        numberAsString3 += 1;
        number2 += 1;

        // Print result
        System.out.println("numberAsAString3 = " + numberAsString3);
        System.out.println("number2 = " + number2);
    }
}
