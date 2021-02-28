// Coding Exercise
// Write a method called printMegaBytesAndKiloBytes that has a a parameter of type int with the name
// kiloBytes.
// The method should not return anything (void) and it needs to calculate the megabytes and remaining
// kilobytes from the kilobytes parameter.
// Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
// XX represents the original value kiloBytes
// YY represents the calculated megaBytes
// ZZ represents the calculated remaining kiloBytes

public class Main {
    public static void main(String[] args) {
        // Call method from class and convert 2500 KiloBytes to MegaBytes and a remainder
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        // Call method from class and convert 2500 KiloBytes to MegaBytes and a remainder
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);

        // Call method from class and convert 2500 KiloBytes to MegaBytes and a remainder
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}
