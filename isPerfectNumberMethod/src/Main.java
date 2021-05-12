public class Main {
    public static void main(String[] args) {
        // Setup a variable to accept return value (4)
        boolean result = isPerfectNumber.isPerfectNumber(6);
        System.out.println(result);

        result = isPerfectNumber.isPerfectNumber(28);
        System.out.println(result);

        result = isPerfectNumber.isPerfectNumber(5);
        System.out.println(result);

        result = isPerfectNumber.isPerfectNumber(-1);
        System.out.println(result);
    }
}
