package pl.michalak.adam.algorithm;

import pl.michalak.adam.board.BoardAPI;
import pl.michalak.adam.output.Display;

class Recursion {
    private final boolean shouldInfoBePrinted;
    private final static char fromRod = 'A';
    private final static char toRod = 'B';
    private final static char tempRod = 'C';
    private final StepCounter stepCounter;
    private BoardAPI boardAPI;

    Recursion(boolean shouldInfoBePrinted){
        this.shouldInfoBePrinted = shouldInfoBePrinted;
        this.stepCounter = new StepCounter();
    }

    void useRecursion(int numberOfDisks) {
        this.boardAPI = new BoardAPI(numberOfDisks);
        swapDisks(numberOfDisks, fromRod, toRod, tempRod);
    }

    private void swapDisks(int numberOfDisks, char fromRod, char toRod, char tempRod) {
        if(stepCounter.getSteps() == 0 && this.shouldInfoBePrinted) {
            Display.displayWithNextLine(boardAPI.printBoard());
        }
        if(numberOfDisks == 1) {
            stepCounter.addOneStep();
            boardAPI.moveDiskFromOneRodToTheOther(fromRod, toRod);
            if(this.shouldInfoBePrinted) {
                Display.displayWithNextLine(boardAPI.printBoard());
            }
            return;
        }
        swapDisks(numberOfDisks-1, fromRod, tempRod, toRod);
        stepCounter.addOneStep();
        boardAPI.moveDiskFromOneRodToTheOther(fromRod, toRod);
        if(this.shouldInfoBePrinted) {
            Display.displayWithNextLine(boardAPI.printBoard());
        }
        swapDisks(numberOfDisks-1, tempRod, toRod, fromRod);
    }
}
