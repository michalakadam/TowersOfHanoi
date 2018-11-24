package pl.michalak.adam.input;

import pl.michalak.adam.output.Display;

import java.util.InputMismatchException;

class IntInputValidator {

    private static int checkInputFromPlayer(InputReader keyboard) {
        try {
            return keyboard.getInt();
        }
        catch(InputMismatchException inputMismatchException) {
            Display.displayWithNextLine("Wrong input. You have to provide a number. ");
            keyboard.getString();
            return checkInputFromPlayer(keyboard);
        }
    }

    private static boolean inputIsInRange(int input, int min, int max)
    {
        return input >= min && input <= max;
    }

    static int getInput(InputReader keyboard, String message, int min, int max) {
        Display.displayWithNextLine(message);
        int input = checkInputFromPlayer(keyboard);
        if (inputIsInRange(input, min, max)) {
            return input;
        }
        Display.displayWithNextLine(String.format("Provided number is out of range [%s, %s]. Try again! ", min, max));
        return getInput(keyboard, message, min, max);
    }
}
