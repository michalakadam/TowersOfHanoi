package pl.michalak.adam.input;

class StringInputValidator {
    private static boolean checkInput(String expected, String actual)
    {
        //case does not matter in comparison
        return expected.toLowerCase().equals(actual.toLowerCase());
    }
    static String getInput(InputReader keyboard, String message, String option1, String option2)
    {
        System.out.println(message);
        String answer = keyboard.getString();
        if(checkInput(option1, answer) || checkInput(option2, answer))
            return answer.toLowerCase();
        System.out.println(String.format("Insert one of those answers: [%s, %s]. ", option1, option2));
        return getInput(keyboard, message, option1, option2);
    }
}
