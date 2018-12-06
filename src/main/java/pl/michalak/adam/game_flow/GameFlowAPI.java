package pl.michalak.adam.game_flow;

import pl.michalak.adam.algorithm.AlgorithmAPI;

/**
 * Responsible for controlling the flow of this app.
 * @author Adam_Michalak
 */
public class GameFlowAPI {
    private final GameFlowController gameFlowController = new GameFlowController();


    public void manageFlow() {
        int numberOfDisks = gameFlowController.getNumbersOfDisksFromUser();
        boolean shouldInfoBePrinted = gameFlowController.getDecisionAboutProgressPrinting();
        AlgorithmAPI algorithmAPI = new AlgorithmAPI(shouldInfoBePrinted);
        algorithmAPI.makeUseOfTheRecursion(numberOfDisks);
        gameFlowController.summary(algorithmAPI.getNumberOfSteps(), algorithmAPI.getTimeOfRecursion());
    }
}
