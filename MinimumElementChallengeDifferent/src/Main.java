//Write a method called readInteger() that has no parameters and returns an int.
//
//        It needs to read in an integer from the user - this represents how many elements the user needs to enter.
//
//        Write another method called readElements() that has one parameter of type int
//
//        The method needs to read from the console until all the elements are entered, and then return an array containing
//        the elements entered.
//
//        And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the
//        minimum value in the array.
//
//        The scenario is:
//
//        1. readInteger() is called.
//
//        2. The number returned by readInteger() is then used to call readElements().
//
//        3. The array returned from readElements() is used to call findMin().
//
//        4. findMin() returns the minimum number.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       MinimumElement.doThree();
    }
}
