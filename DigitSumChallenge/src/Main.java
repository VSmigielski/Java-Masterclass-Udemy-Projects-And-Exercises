// Coding Challenge
// Write a method with the name sumDigits that has one int parameter called number
// If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise
// return -1 to indicate an invalid value
// The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process
// negative numbers , so also return -1 for negative numbers
// For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8
// Calling the method sumDigits(1) should return -1 as per requirements described above
// Use n % 10 for last digit
// Use n / 10 for others

public class Main {
    public static void main(String[] args) {
        // Get the sum of 125's digits -- 8
        int result = sumDigits.sumDigits(125);
        // Print the amount of digits
        System.out.println("The sum of the digits of 125 is " + result);

        // Will return -1 due to invalid value
        result = sumDigits.sumDigits(-125);
        // Print the amount of digits
        System.out.println("The sum of the digits of -125 is " + result);

        // Will return -1 due to invalid value
        result = sumDigits.sumDigits(4);
        // Print the amount of digits
        System.out.println("The sum of the digits of 4 is " + result);

        // Get the sum of 125's digits -- 8
        result = sumDigits.sumDigits(32123);
        // Print the amount of digits
        System.out.println("The sum of the digits of 32123 is " + result);
    }
}
