public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr);
        reverse(arr);
        System.out.print("\nReversed array is \n");
        printArray(arr);
    }

    private static void reverse(int[] array) {
        int temp;
        int start = 0;
        int end = array.length - 1;

        while (start < end)
        {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
