public class FactorPrinter {
    public static void printFactors(int number) {
    if (number < 0) {
        System.out.println("Invalid Value");
    }

    int sum = 0;

    for (int i = 1; i <= number; ++i) {

        // if number is divided by i
        // i is the factor
        if (number % i == 0) {
            System.out.print(i + " ");
            sum += i;
        }
    }
    System.out.println("\n" + sum);
    }
}
