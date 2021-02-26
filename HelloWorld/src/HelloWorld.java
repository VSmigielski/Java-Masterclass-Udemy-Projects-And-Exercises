// Create a public class of HelloWorld
public class HelloWorld {

    // Create the main method with parameter
    public static void main(String[] args){

        // Use predefined java to output the text "Hello World"
        System.out.println("Hello World");

        // Modify/Re-run the text to print Hello [name]
        System.out.println("Hello, Veronica");

        // Declare variable of data type int and assign value
        int myFirstNumber = 5;

        // Display the number on the screen
        System.out.println(myFirstNumber);

        // Update myFirstNumber with new value
        myFirstNumber = 5 + 10;

        // Display updated input on screen
        System.out.println(myFirstNumber);

        // Update myFirstNumber with new value
        myFirstNumber = (5 + 10) + (2 * 10);

        // Display updated input on screen
        System.out.println(myFirstNumber);

        // Declare two new variables
        int mySecondNumber = 12;
        int myThirdNumber = 6;

        // Declare a total inside a variable
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        // Display items on screen myTotal
        System.out.println(myTotal);

        // Update myThirdNumber with new value
        myThirdNumber = myFirstNumber * 2;

        // Update myTotal with new value
        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        // Display on screen myTotal value
        System.out.println(myTotal);

        // Declare a new variable
        int myLastOne = 1000 - myTotal;

        // Display on screen myLastOne value
        System.out.println(myLastOne);
    }
}
