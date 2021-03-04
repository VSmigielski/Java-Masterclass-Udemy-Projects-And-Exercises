import java.lang.Math;
public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        // Copy the number into the variable palindrome
        int palindrome = number;

        // Initialize reverse
        int reverse = 0;

        // While the variable isn't 0
        // Works for negatives and positives
        while (palindrome != 0) {
            // Get the lastDigit from the variable
            int lastDigit = palindrome % 10;
            // Update reverse to include the lastDigit and multiply by 10 with previous value
            reverse = reverse * 10 + lastDigit;
            // Divide by 10 to retrieve the new int to use in while loop
            palindrome = palindrome / 10;
        }

        // Check if the original argument is equal to the reverse
        if (number == reverse) {
            // If equal, return true
            return true;
        }
        // If not equal, return false
        return false;
    }

}


