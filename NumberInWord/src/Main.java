// Coding Exercise
// Write a method called printNumberInWord. The method has one parameter number which is the whole number. The
// method needs to print "ZERO", "ONE", "TWO",...."NINE", "OTHER" if the int parameter number is 0, 1, 2...9
// or other for any other number including negative numbers. You can use if-else statement or switch statement
// whichever is easier for you

public class Main {
    public static void main(String[] args) {
        // TWO
        NumberInWord.printNumberInWord(2);

        // SEVEN
        NumberInWord.printNumberInWord(7);

        // OTHER
        NumberInWord.printNumberInWord(12);

        // OTHER
        NumberInWord.printNumberInWord(-4);

        // EIGHT
        NumberInWord.printNumberInWord2(8);

        // THREE
        NumberInWord.printNumberInWord2(3);

        // OTHER
        NumberInWord.printNumberInWord2(19);

        // OTHER
        NumberInWord.printNumberInWord2(-6);
    }
}
