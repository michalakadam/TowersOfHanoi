package pl.michalak.adam.output;

/**
 * Wrapper for System.out.print() / System.out.println() method
 * @author Adam_Michalak
 */
public class Display {

    public static void displayWithoutNextLine(String message) {
            System.out.print(message);
        }

    public static void displayWithNextLine(String message) {
        System.out.print(message);
    }

}
