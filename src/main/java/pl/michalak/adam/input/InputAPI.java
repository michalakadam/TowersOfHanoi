package pl.michalak.adam.input;

/**
 * This component is responsible for verifying and providing input from the user.
 * @author Adam_Michalak
 */

public class InputAPI {
    InputReader inputReader;

    public InputAPI() {
        this.inputReader = new InputReader(System.in);
    }
    public String getAndValidateStringInput(String message, String option1, String option2)
    {
        return StringInputValidator.getInput(inputReader, message, option1, option2);
    }
    public int getAndValidateIntInput(String message, int min, int max)
    {
        return IntInputValidator.getInput(inputReader, message, min, max);
    }
    
}
