import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a count: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();
        return capacity;
    }

    private static int[] readElements(int values){
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[values];
        for(int i=0; i<elements.length; i++){
            System.out.println("Enter a number:\r");
            int totalElementEntered = scanner.nextInt();
            scanner.nextLine();
            elements[i] = totalElementEntered;

        }
        return elements;
    }

    private static int findMin(int[] count){
        int min = Integer.MAX_VALUE;
        for(int i=0; i< count.length; i++) {
            int minVal = count[i];
            if (minVal < min) {
                min = minVal;
            }
        }
        return min;
    }

    public static void doThree() {
        int result = MinimumElement.readInteger();
        int[] newArray = MinimumElement.readElements(result);
        System.out.println("This is the minimum value of the array: " + MinimumElement.findMin(newArray));
    }
}
