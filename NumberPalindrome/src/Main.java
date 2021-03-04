// Coding Exercise
// Write a method called isPalindrome with one int parameter called number
// The method needs to return a boolean
// It should return true if the number is a palindrome number otherwise it should return false


public class Main {
    public static void main(String[] args) {
        // True
        boolean result = NumberPalindrome.isPalindrome(-1221);
        // Print on screen
        System.out.println(result);

        // True
        result = NumberPalindrome.isPalindrome(707);
        // Print on screen
        System.out.println(result);

        // False
        result = NumberPalindrome.isPalindrome(11212);
        // Print on screen
        System.out.println(result);
    }
}
