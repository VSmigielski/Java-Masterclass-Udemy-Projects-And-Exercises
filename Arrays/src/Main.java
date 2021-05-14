public class Main {
    public static void main(String[] args) {
        // Define array
        int[] myIntArray = new int[10];

        myIntArray[0] = 45;
        myIntArray[1] = 476;
        myIntArray[2] = 20;

        // Saving into element/index 6
        myIntArray[5] = 50;

        // Auto assign 10 elements
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Auto assign 10 elements
        int[] myIntArray3 = new int[10];

        // Initialize 10 elements by using a for loop
        for (int i = 0; i < 10; i++) {
            myIntArray3[i] = i * 10;
        }

        // Define an array for 25 elements
        int[] myIntArray4 = new int[25];

        // Initialize all 25 elements
        for (int i = 0; i < myIntArray4.length; i++) {
            myIntArray4[i] = i * 10;
        }

        // Define array
        double[] myDoubleArray = new double[10];

        // Saving into element/index 6
        myDoubleArray[5] = 50.0;

        // Prints the 6th element
        System.out.println(myIntArray[5]);

        // Print out the second array elements
        System.out.println(myIntArray2[6]);
        System.out.println(myIntArray2[8]);

        // Print out the element index and value using a for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Element: " + i + ", Value: " + myIntArray3[i]);
        }

        // Print out the element index and value using a for loop
        for (int i = 0; i < myIntArray2.length; i++) {
            System.out.println("Element: " + i + ", Value: " + myIntArray3[i]);
        }

        printArray(myIntArray2);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element: " + i + ", Value: " + array[i]);
        }
    }
}
