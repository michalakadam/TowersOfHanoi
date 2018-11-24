package pl.michalak.adam.output;

/**
 * Wrapper for System.out.print() / System.out.println() method
 * @author Adam_Michalak
 */
public class Display {

    public static void displayWithoutNextLine(String wiadomość) {
            System.out.print(wiadomość);
        }

    public static void displayWithNextLine(String wiadomość) {
        System.out.print(wiadomość);
    }

}
