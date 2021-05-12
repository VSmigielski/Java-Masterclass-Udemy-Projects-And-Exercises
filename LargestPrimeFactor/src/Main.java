public class Main {
    public static void main(String[] args) {
        int result = LargestPrimeFactor.largestPrimeFactor(21);
        System.out.println(result);

        result = LargestPrimeFactor.largestPrimeFactor(217);
        System.out.println(result);

        result = LargestPrimeFactor.largestPrimeFactor(0);
        System.out.println(result);

        result = LargestPrimeFactor.largestPrimeFactor(45);
        System.out.println(result);

        result = LargestPrimeFactor.largestPrimeFactor(-1);
        System.out.println(result);
    }
}
