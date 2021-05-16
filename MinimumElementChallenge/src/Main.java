import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Get user input for how many numbers to enter
        System.out.println("Enter a count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] myIntegers = readIntegers(count);

        System.out.println("This is the minimum value of the array: " + findMin(myIntegers));
    }

    private static int[] readIntegers(int count) {
        // System.out.println("Enter " + count + " integer values.\r");
        int[] values = new int[count];

        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter a number:\r");
            int number = scanner.nextInt();
            scanner.nextLine();
            values[i] = number;
        }

        return values;
    }

    private static int findMin(int[] array) {
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < array.length; i++) {
//             int value = array[i];
//             if (value < min) {
//                 min = value;
//             }
//         }
//         return min;

        int minValue = array[0];

        for(int i = 1; i < array.length; i++){
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }

}
