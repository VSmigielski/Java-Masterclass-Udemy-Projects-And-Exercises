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

        TimPrinter printer2 = new TimPrinter(50, true);
        System.out.println("initial page count = " + printer2.getPagesPrinted());
        int pagesPrinted = printer2.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer2.getPagesPrinted());

        TimPrinter printer3 = new TimPrinter(50, false);
        System.out.println("initial page count = " + printer2.getPagesPrinted());
        pagesPrinted = printer3.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer3.getPagesPrinted());
        pagesPrinted = printer3.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer3.getPagesPrinted());
    }
}
