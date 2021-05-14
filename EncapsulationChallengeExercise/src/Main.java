public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(20,false);

        printer.fillToner(81);
        printer.fillToner(20);
        printer.fillToner(-40);

        printer.printPage(2);
        printer.printPage(4);

        Printer printer1 = new Printer(20, true);
        printer1.printPage(2);
        printer1.printPage(4);
    }
}
