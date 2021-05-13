public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("total= " + calculator.getTotalCost());

        Carpet carpet2 = new Carpet(1.5);
        Floor floor2 = new Floor(5.4, 4.5);
        Calculator calculator2 = new Calculator(floor2, carpet2);

        System.out.println("total= " + calculator2.getTotalCost());
    }
}
