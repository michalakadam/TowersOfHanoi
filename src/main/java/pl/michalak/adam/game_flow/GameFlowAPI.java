package pl.michalak.adam.game_flow;

/**
 * This component is responsible for controlling the flow of this app.
 * @author Adam_Michalak
 */
public class GameFlowAPI {

    GameFlowController gameFlowController = new GameFlowController();

    public void manageFlow()
    {
        gameFlowController.getNumbersOfDisksFromUser();
        gameFlowController.getDecisionAboutProgressPrinting();
        gameFlowController.summary();
    }

}
