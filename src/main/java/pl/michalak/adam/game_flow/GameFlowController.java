package pl.michalak.adam.game_flow;

import pl.michalak.adam.input.InputAPI;

class GameFlowController {
    private final InputAPI input = new InputAPI();

    int getNumbersOfDisksFromUser() {
        return input.getAndValidateIntInput("Enter number of disks [1, 50]: ", 1, 50);
    }

    boolean getDecisionAboutProgressPrinting() {
        return (input.getAndValidateStringInput("Do you want to see steps needed to move the tower from one rod to the other? (Y/N) ", "Y", "N").equals("y"));
    }

    void summary(int numberOfSteps, double timeOfRecursion) {
        System.out.println("\nDONE! Whole calculation took "+numberOfSteps+" steps in "+timeOfRecursion+" seconds.");
    }
}
