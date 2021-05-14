// Simulate a real Computer Printer
// fields: tonerLevel, numberOfPagesPrinted, and bool duplexPrinter
// Add methods to fill up the toner to a maximum of 100%, another method to simulate printing a page (increase pages
// printed)
public class Printer {
    private int tonerLevel;
    private int numberOfPages = 0;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.numberOfPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void printPage(int amount) {
        int pagesToPrint = amount;
        if (duplexPrinter) {
            pagesToPrint /= 2 + (amount % 2);
            System.out.println("Printing in duplex mode");
        }
        System.out.println("The current amount of pages printed is " + numberOfPages);
        numberOfPages += pagesToPrint;
        System.out.println("The number of pages to be printed was " + amount
                + " and the current amount printed is " + numberOfPages);
    }

    public void fillToner(int amount) {
        if (tonerLevel > 0 && tonerLevel + amount <= 100) {
            tonerLevel += amount;
            System.out.println("The toner is currently at this percentage: " + tonerLevel);
        } else if (tonerLevel + amount <= 0) {
            tonerLevel = 0;
            System.out.println("The toner is completely empty!");
        } else {
            System.out.println("You have tried to add too much toner! The current toner level is " + tonerLevel
                    + ". You may add this percentage to fill it up to full: " + (100 - tonerLevel));
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
