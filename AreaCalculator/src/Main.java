// Coding Exercise
// Write a method named area with one double parameter named radius
// The method needs to return a double value that represents the area of a circle
// If the parameter radius is negative then return -1.0 to represent an invalid value
// Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides
// of a rectangle
// The method needs to return an area of a rectangle
// If either or both parameters is/are a negative return -1.0 to indicate an invalid value
// For formulas and PI value please check the tips below

import java.awt.geom.Area;

public class Main {
    public static void main(String[] args) {

        double area = AreaCalculator.area(2.5);
        System.out.println("The area of the circle is: " + area);
        
        area = AreaCalculator.area(5, 6);
        System.out.println("The area of the rectangle is: " + area);


    }
}
