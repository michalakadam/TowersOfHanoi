package pl.michalak.adam.input;

import java.util.InputMismatchException;

public class IntInputValidator {
    private static int checkInputFromPlayer(InputReader keyboard)
    {
        try {
            return keyboard.getInt();
        }
        catch(InputMismatchException inputMismatchException) {
            System.out.println("Zła wartość -> wpisz liczbę. ");
            keyboard.getString();
            return checkInputFromPlayer(keyboard);
        }
    }
    private static boolean inputIsInRange(int input, int min, int max)
    {
        return input >= min && input <= max;
    }
    static int getInput(InputReader keyboard, String message, int min, int max)
    {
        System.out.println(message);
        int input = checkInputFromPlayer(keyboard);
        if (inputIsInRange(input, min, max)) {
            return input;
        }
        System.out.println(String.format("Liczba poza przedziałem [%s, %s]. Spróbuj jeszcze raz! ", min, max));
        return getInput(keyboard, message, min, max);
    }
}
